package ru.javarush.internship.parts.service;

import org.junit.Test;
import ru.javarush.internship.parts.entity.Product;

public class ProductServiceImplTest {
    @Test
    public void testAdd() {
        ProductServiceImpl service = new ProductServiceImpl();
        Product product = new Product("masturbate device", true, 1);
        product.setId(50);
        System.out.println(product.getId());
        service.saveProduct(product);
    }

}
