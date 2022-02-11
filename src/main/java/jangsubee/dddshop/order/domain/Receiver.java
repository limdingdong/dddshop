package jangsubee.dddshop.order.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Receiver {

    @Column(name = "receiver_name")
    private String name;
    @Column(name = "receiver_phone")
    private String phone;
}
