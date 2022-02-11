package jangsubee.dddshop.product.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("II")
public class InternalImage extends Image {

    @Override
    public String getURL() {
        return null;
    }

    @Override
    public boolean hasThumnail() {
        return false;
    }

    @Override
    public String getThumnailURL() {
        return null;
    }
}
