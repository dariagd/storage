package ru.ddg.storage.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.dto.ProductCompositionDto;
import ru.ddg.storage.service.impl.ProductCompositionServiceImpl;

@Controller
@RequestMapping("/productComposition")
public class ProductCompositionController {
    private final ProductCompositionServiceImpl productCompositionService;

    public ProductCompositionController(ProductCompositionServiceImpl productCompositionService) {
        this.productCompositionService = productCompositionService;
    }

    @GetMapping("/home")
    public String viewHomePage(Model model){
        model.addAttribute("listProductComposition", productCompositionService.getAll());
        return "productComposition/index";
    }

    @GetMapping("/showNewProductCompositionForm")
    public String showNewProductCompositionForm(Model model){
        ProductCompositionDto productCompositionDto = new ProductCompositionDto();
        model.addAttribute("productComposition", productCompositionDto);
        return "productComposition/new_productComposition";
    }

    @PostMapping("/saveProductComposition")
    public String addProductComposition(@ModelAttribute("productComposition") ProductCompositionDto productCompositionDto){
        productCompositionService.insert(productCompositionDto);
        return "redirect:/productComposition/home";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        ProductCompositionDto productCompositionDto = productCompositionService.getById(id);
        model.addAttribute("productComposition", productCompositionDto);
        return "productComposition/update_productComposition";
    }

    @GetMapping("/deleteProductComposition/{id}")
    public String deleteProductComposition(@PathVariable(value = "id") Long id){
        productCompositionService.delete(id);
        return "redirect:/productComposition/home";
    }
}
