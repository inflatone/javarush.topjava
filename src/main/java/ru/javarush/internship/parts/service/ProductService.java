package ru.javarush.internship.parts.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.javarush.internship.parts.entity.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Integer id);
    void saveProduct(Product product);
    void updateProduct(Integer id, String name, Integer quantity, boolean isNecessary);
    void deleteProduct(Integer id);

    Page<Product> findAllByOrderByName(Pageable pageable);
    Page<Product> findAllByNecessaryIsFalse(Pageable pageable);
    Page<Product> findAllByNecessaryIsTrue(Pageable pageable);
    Page<Product> findProductByName(Pageable pageable, String name);
    List<Product> findAllByNecessaryIsTrueSorted();
}
