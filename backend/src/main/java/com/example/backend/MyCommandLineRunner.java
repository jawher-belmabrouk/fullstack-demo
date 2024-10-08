package com.example.backend;

import com.example.backend.model.Product;
import com.example.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setTitle("A Tale of Two Cities");
        product.setPrice(39D);
        product.setQuantity(11);
        productService.save(product);

        Product product2 = new Product();
        product2.setTitle("Le Petit Prince");
        product2.setPrice(17D);
        product2.setQuantity(8);
        productService.save(product2);
    }
}
