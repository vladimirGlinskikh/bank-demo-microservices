package kz.zhelezyaka.repository;

import kz.zhelezyaka.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
