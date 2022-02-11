package jangsubee.dddshop.product.domain;

public interface ProductRepository {

    public Product findById(ProductId id);

    void save(Product product);

    // 식별자 생성 메서드
    ProductId nextId();
}
