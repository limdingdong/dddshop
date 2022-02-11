package jangsubee.dddshop.order.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@Embeddable
@NoArgsConstructor
public class Address {

    private String zipcode;
    private String basicAddress;
    private String detailAddress;
}
