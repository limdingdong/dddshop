package jangsubee.dddshop.product.domain.service;

import jangsubee.dddshop.product.domain.ProductId;
import org.springframework.stereotype.Service;

@Service
public class ProductIdService {
    public ProductId nextId() {
        return new ProductId();
    }
}
