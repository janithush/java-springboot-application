package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> listall() {
        return (List<Product>) productRepository.findAll();
    }
    public Product getProductById(long id) {
        return productRepository.findById(id).get();
    }
//    public Product getProductById(String name) {
//        return productRepository.findByName(name).get();
//    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }



}
