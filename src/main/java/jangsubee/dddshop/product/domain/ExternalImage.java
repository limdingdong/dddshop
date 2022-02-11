package jangsubee.dddshop.product.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EI")
public class ExternalImage extends Image {

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
