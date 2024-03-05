package kz.zhelezyaka.service;

import kz.zhelezyaka.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    Product createProduct(String title, String details);
}

