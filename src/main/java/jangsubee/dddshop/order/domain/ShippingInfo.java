package jangsubee.dddshop.order.domain;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Embeddable
@RequiredArgsConstructor
public class ShippingInfo {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipcode", column = @Column(name = "shipping_zipcode")),
            @AttributeOverride(name = "basicAddress", column = @Column(name = "shipping_basicAddress")),
            @AttributeOverride(name = "detailAddress", column = @Column(name = "shipping_detailAddress"))
    })
    private Address address;

    @Column(name = "shipping_message")
    private String message;

    @Embedded
    private Receiver receiver;
}
