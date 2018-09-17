package ru.javarush.internship.parts.service;

import ru.javarush.internship.parts.entity.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Integer id);
    void saveProduct(Product product);
    void updateProduct(Integer id, String name, Integer quantity, boolean isNecessary);
    void deleteProduct(Integer id);

    List<Product> findAllByOrderByName();
    List<Product> findAllByNecessaryIsFalse();
    List<Product> findAllByNecessaryIsTrue();
    List<Product> findAllByNecessaryIsTrueSorted();
    List<Product> findProductByName(String name);
}
