package ru.ddg.storage.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ddg.storage.dto.EmployeeDto;
import ru.ddg.storage.service.impl.EmployeeServiceImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/home")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployee", employeeService.getAll());
        return "employee/index";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        EmployeeDto employeeDto = new EmployeeDto();
        model.addAttribute("employee", employeeDto);
        return "employee/new_employee";
    }

    @PostMapping("/saveEmployee")
    public String addEmployee(@ModelAttribute("employee") EmployeeDto employeeDto){
        employeeService.insert(employeeDto);
        return "redirect:/employee/home";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model){
        EmployeeDto employeeDto = employeeService.getById(id);
        model.addAttribute("employee", employeeDto);
        return "employee/update_employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long id){
        employeeService.delete(id);
        return "redirect:/employee/home";
    }
}
