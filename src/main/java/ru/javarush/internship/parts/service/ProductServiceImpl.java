package ru.javarush.internship.parts.service;

import ru.javarush.internship.parts.repository.ProductRepository;
import ru.javarush.internship.parts.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    @Autowired
    public void setNoteRepository(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product getProductById(Integer id) {
        return this.repository.getOne(id);
    }

    @Override
    public void saveProduct(Product product) {
        this.repository.save(product);

    }

    @Override
    public void updateProduct(Integer id, String name, boolean isNecessary) {
        Product updated = this.repository.getOne(id);
        updated.setNecessary(isNecessary);
        updated.setName(name);
        this.repository.save(updated);
    }

    @Override
    public void deleteProduct(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public List<Product> findAllByOrderByName() {
        return this.repository.findAllByOrderByName();
    }

    @Override
    public List<Product> findAllByNecessaryIsFalse() {
        return this.repository.findAllByNecessaryIsFalseOrderByName();
    }

    @Override
    public List<Product> findAllByNecessaryIsTrue() {
        return this.repository.findAllByNecessaryIsTrueOrderByName();
    }
}
