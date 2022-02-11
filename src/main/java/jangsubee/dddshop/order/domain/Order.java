package jangsubee.dddshop.order.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
public class Order {

    @EmbeddedId
    private OrderNo orderNo;

    @Embedded
    private ShippingInfo shippingInfo;

    @Embedded
    private Orderer orderer;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private OrderState state;

    @ElementCollection
    @CollectionTable(name = "order_line", joinColumns = @JoinColumn(name = "order_number"))
    @OrderColumn(name = "line_idx")
    private List<OrderLine> orderLines;

    public void changeShippingInfo(ShippingInfo newShippingInfo) {
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
    }

    private void setShippingInfo(ShippingInfo shippingInfo) {
        if (shippingInfo == null) {
            throw new IllegalArgumentException("배송지 정보는 필수 입력사항 입니다.");
        }
    }

    private void verifyNotYetShipped() {
        if (state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING) {
            throw new IllegalStateException("already shipped");
        }
    }
}
