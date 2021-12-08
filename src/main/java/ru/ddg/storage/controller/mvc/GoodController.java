package ru.ddg.storage.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.dto.GoodDto;
import ru.ddg.storage.service.impl.GoodServiceImpl;

@Controller
@RequestMapping("/good")
public class GoodController {
    private final GoodServiceImpl goodService;

    public GoodController(GoodServiceImpl goodService) {
        this.goodService = goodService;
    }

    @GetMapping("/home")
    public String viewHomePage(Model model){
        model.addAttribute("listGood", goodService.getAll());
        return "good/index";
    }

    @GetMapping("/showNewGoodForm")
    public String showNewGoodForm(Model model){
        GoodDto goodDto = new GoodDto();
        model.addAttribute("good", goodDto);
        return "good/new_good";
    }

    @PostMapping("/saveGood")
    public String addGood(@ModelAttribute("good") GoodDto goodDto){
        goodService.insert(goodDto);
        return "redirect:/good/home";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        GoodDto goodDto = goodService.getById(id);
        model.addAttribute("good", goodDto);
        return "good/update_good";
    }

    @GetMapping("/deleteGood/{id}")
    public String deleteGood(@PathVariable(value = "id") Long id){
        goodService.delete(id);
        return "redirect:/good/home";
    }
}
