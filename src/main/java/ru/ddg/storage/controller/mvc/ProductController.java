package ru.ddg.storage.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.dto.ProductDto;
import ru.ddg.storage.service.impl.ProductServiceImpl;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/home")
    public String viewHomePage(Model model){
        model.addAttribute("listProduct", productService.getAll());
        return "product/index";
    }

    @GetMapping("/showNewProductForm")
    public String showNewProductForm(Model model){
        ProductDto productDto = new ProductDto();
        model.addAttribute("product", productDto);
        return "product/new_product";
    }

    @PostMapping("/saveProduct")
    public String addProduct(@ModelAttribute("product") ProductDto productDto){
        productService.insert(productDto);
        return "redirect:/product/home";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        ProductDto productDto = productService.getById(id);
        model.addAttribute("product", productDto);
        return "product/update_product";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable(value = "id") Long id){
        productService.delete(id);
        return "redirect:/product/home";
    }
}
