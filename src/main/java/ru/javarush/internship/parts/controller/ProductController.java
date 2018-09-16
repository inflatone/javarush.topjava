package ru.javarush.internship.parts.controller;

import ru.javarush.internship.parts.entity.Product;
import ru.javarush.internship.parts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    private ProductService service;

    private int counter = 0;
    private boolean activator = false;

    @Autowired
    public void setProductService(ProductService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Product> products = filterAndSort();
        model.addAttribute("products", products);
        model.addAttribute("counter", counter);

        return "index";
    }

    @GetMapping("/sort")
    public String sortChoose() {
        this.activator = true;
        return "redirect:/";
    }

    @GetMapping("/new")
    public String addProduct() {
        return "operations/new";
    }

    @PostMapping("/save")
    public String updateProduct(@RequestParam String message) {
        this.service.saveProduct(new Product(message, 0));
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(
            @PathVariable Integer id,
            Model model
    ) {
        Product product = this.service.getProductById(id);
        model.addAttribute("note", product);
        return "operations/edit";
    }

    @PostMapping("/update")
    public String saveProduct(
            @RequestParam Integer id,
            @RequestParam String name,
            @RequestParam(value = "done", required = false) boolean isNecessary
    ) {
        this.service.updateProduct(id, name,isNecessary);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        this.service.deleteProduct(id);
        return "redirect:/";
    }

    private List<Product> filterAndSort() {
        List<Product> products = null;

        if (activator) {
            this.counter = this.counter < 2 ? ++this.counter : 0;
            this.activator = false;
        }

        switch (this.counter) {
            case 0 :
                products = this.service.findAllByOrderByName();
                break;
            case 1 :
                products = this.service.findAllByNecessaryIsTrue();
                break;
            case 2 :
                products = this.service.findAllByNecessaryIsFalse();
                break;

        }
        return products;
    }
}
