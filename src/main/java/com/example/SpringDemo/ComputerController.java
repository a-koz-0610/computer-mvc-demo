package com.example.SpringDemo;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class ComputerController {

    @Resource
    private ComputerRepository computerRepo;

    @RequestMapping("/home")
    public String goHome() {
        return "index";
    }

    @RequestMapping("/computers")
    public String getAllComputers(Model model) {
        model.addAttribute("allComputersModel", computerRepo.findAll());
        return "all-computers-template";
    }

    @RequestMapping("/computers/{name}")
    public String getOneComputerbyName(@PathVariable String name, Model model) {
        Computer retrievedComputer = computerRepo.findComputerByName(name);
        model.addAttribute("singleComputerModel", retrievedComputer);
        return "one-computer-template-name";
    }

    @RequestMapping("/computers-by-id/{id}")
    public String getOneComputer(@PathVariable Long id, Model model) {
        Optional<Computer> computer = computerRepo.findById(id);
        model.addAttribute("singleComputerModel", computer.get());
        return "one-computer-template-id";
    }


}
