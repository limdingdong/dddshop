package jangsubee.dddshop.order.application;

import jangsubee.dddshop.order.domain.Order;
import jangsubee.dddshop.order.domain.OrderNo;
import jangsubee.dddshop.order.domain.OrderRepository;
import jangsubee.dddshop.order.domain.ShippingInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ChangeOrderService {

    private final OrderRepository orderRepository;

    @Transactional
    public void changeShippingInfo(OrderNo no, ShippingInfo newShippingInfo) {
        Order order = orderRepository.findById(no);
        if (order == null) {
            throw new IllegalArgumentException("주문이 존재하지 않습니다.");
        }
        order.changeShippingInfo(newShippingInfo);
    }
}
