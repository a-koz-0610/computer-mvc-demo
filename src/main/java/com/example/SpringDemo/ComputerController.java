package com.example.SpringDemo;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("allComputersModel", computerRepo.getAllComputers());
        return "all-computers-template";
    }

    // @RequestMapping("/computers/{id}")
    // public String getOneComputer(@PathVariable Long id, Model model) {
    // model.addAttribute("singleComputerModel", computerRepo.getOneComputer(id));
    // return "one-computer-template";
    // }

    @RequestMapping("/computers/{name}")
    public String getOneComputerbyName(@PathVariable String name, Model model) {
        model.addAttribute("singleComputerModel", computerRepo.getOneComputerByName(name));
        return "one-computer-template";
    }

}
