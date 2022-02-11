package jangsubee.dddshop.infra;

import jangsubee.dddshop.order.domain.Order;
import jangsubee.dddshop.order.domain.OrderNo;
import jangsubee.dddshop.order.domain.OrderRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class JpaOrderRepository implements OrderRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Order findById(OrderNo id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    public void save(Order order) {
        entityManager.persist(order);
    }

    @Override
    public List<Order> findByOrdererId(String ordererId, int startRow, int fetchSize) {
        TypedQuery<Order> query = entityManager.createQuery(
                "select o from Order o " +
                        "where o.orderer.memberId.id = :ordererId " +
                        "order by o.orderNo.orderId desc "
                , Order.class
        );
        query.setParameter("ordererId", ordererId);
        query.setFirstResult(startRow);
        query.setMaxResults(fetchSize);
        return query.getResultList();
    }

    @Override
    public void delete(Order order) {
        entityManager.remove(order);
    }
}
