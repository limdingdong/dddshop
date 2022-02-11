package jangsubee.dddshop.product.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductId implements Serializable {

    private String id;
}
