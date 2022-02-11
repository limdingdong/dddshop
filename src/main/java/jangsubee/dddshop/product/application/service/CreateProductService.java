package jangsubee.dddshop.product.application.service;

import jangsubee.dddshop.product.application.ProductCreationCommand;
import jangsubee.dddshop.product.domain.Product;
import jangsubee.dddshop.product.domain.ProductId;
import jangsubee.dddshop.product.domain.ProductRepository;
import jangsubee.dddshop.product.domain.service.ProductIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateProductService {

    private final ProductIdService idService;
    private final ProductRepository productRepository;

    @Transactional
    public ProductId createProduct(ProductCreationCommand cmd) {
        // 응용 서비스는 도메인 서비스를 이용해서 식별자를 생성한다.
        ProductId id = idService.nextId();
        //Product product = new Product(id, cmd...);
        Product product = null;
        productRepository.save(product);
        return id;
    }
}
