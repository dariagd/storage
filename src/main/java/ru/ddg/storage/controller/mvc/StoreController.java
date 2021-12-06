package ru.ddg.storage.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.dto.StoreDto;
import ru.ddg.storage.service.impl.StoreServiceImpl;

@Controller
@RequestMapping("/store")
public class StoreController {
    private final StoreServiceImpl storeService;

    public StoreController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/home")
    public String viewHomePage(Model model){
        model.addAttribute("listStore", storeService.getAll());
        return "store/index";
    }

    @GetMapping("/showNewStoreForm")
    public String showNewStoreForm(Model model){
        StoreDto storeDto = new StoreDto();
        model.addAttribute("store", storeDto);
        return "store/new_store";
    }

    @PostMapping("/saveStore")
    public String addStore(@ModelAttribute("store") StoreDto storeDto){
        storeService.insert(storeDto);
        return "redirect:/store/home";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        StoreDto storeDto = storeService.getById(id);
        model.addAttribute("store", storeDto);
        return "store/update_store";
    }

    @GetMapping("/deleteStore/{id}")
    public String deleteStore(@PathVariable(value = "id") Long id){
        storeService.delete(id);
        return "redirect:/store/home";
    }
}
