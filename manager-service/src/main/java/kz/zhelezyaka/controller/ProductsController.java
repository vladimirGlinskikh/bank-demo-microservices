package kz.zhelezyaka.controller;

import kz.zhelezyaka.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;
}
