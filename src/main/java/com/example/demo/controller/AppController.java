package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private ProductService productService;


    public String viewHomePage (Model model) {
        List<Product> listproducts = productService.listall();
        model.addAttribute("listproducts",listproducts);
        return "index";
    }
}
