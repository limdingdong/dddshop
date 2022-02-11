package jangsubee.dddshop.product.application.service;

import jangsubee.dddshop.product.domain.Product;
import jangsubee.dddshop.product.domain.ProductId;
import jangsubee.dddshop.product.domain.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public void removeOptions(ProductId id, int optIdxToBeDeleted) {
        // Product를 로딩. 컬렉션은 지연 로딩으로 설정했다면, Option은 로딩하지 않음
        Product product = productRepository.findById(id);
        // 트랜잭션 범위이므로 지연 로딩으로 설정한 연관 로딩 가능
        product.removeOption(optIdxToBeDeleted);
    }
}
