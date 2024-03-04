package kz.zhelezyaka.repository;

import kz.zhelezyaka.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> products =
            Collections.synchronizedList(new LinkedList<>());
}
