package jangsubee.dddshop.order.domain;

import java.util.List;

public interface OrderRepository {
    Order findById(OrderNo orderNo);
    List<Order> findByOrdererId(String ordererId, int startRow, int size);
    void save(Order order);
    void delete(Order order);
}
