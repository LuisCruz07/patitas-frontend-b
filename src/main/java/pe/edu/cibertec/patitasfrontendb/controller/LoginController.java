package pe.edu.cibertec.patitasfrontendb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*1*/
@Controller
@RequestMapping("/login") /*mapeo*/
public class LoginController {

    @GetMapping("/inicio")
    public String inicio(Model model) {

    model.addAttribute("nombre","Luis Cruz");
        return "inicio";
    }
}

