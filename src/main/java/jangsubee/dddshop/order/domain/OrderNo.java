package jangsubee.dddshop.order.domain;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
public class OrderNo implements Serializable {

    @Column(name = "order_number")
    private String orderId;

    public boolean is2ndGeneration() {
        return orderId.startsWith("N");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderNo orderNo = (OrderNo) o;
        return Objects.equals(orderId, orderNo.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}
