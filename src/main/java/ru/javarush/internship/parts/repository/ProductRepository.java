package ru.javarush.internship.parts.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.javarush.internship.parts.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    List<Product> findAllByNecessaryIsTrueOrderByQuantity();

    Page<Product> findAllByOrderByName(Pageable pageable);
    Page<Product> findAllByNecessaryIsFalseOrderByName(Pageable pageable);
    Page<Product> findAllByNecessaryIsTrueOrderByName(Pageable pageable);
    Page<Product> findProductsByNameContains(Pageable pageable, String name);
}
