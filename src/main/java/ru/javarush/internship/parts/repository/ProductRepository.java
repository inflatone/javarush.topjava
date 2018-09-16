package ru.javarush.internship.parts.repository;

import ru.javarush.internship.parts.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    List<Product> findAllByOrderByName();
    List<Product> findAllByNecessaryIsFalseOrderByName();
    List<Product> findAllByNecessaryIsTrueOrderByName();
    List<Product> findAllByNecessaryIsTrueOrderByQuantity();
}
