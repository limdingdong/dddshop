package jangsubee.dddshop.order.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Email {

    private String userId;
    private String domainAddress;

    public Email(String value) {
        userId = value.split("@")[0];
        domainAddress = value.split("@")[1];
    }
}
