package jangsubee.dddshop.order.domain;

import jangsubee.dddshop.product.domain.ProductId;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class OrderLine {

    @Embedded
    private ProductId productId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "amounts")
    private Money amounts;
}
