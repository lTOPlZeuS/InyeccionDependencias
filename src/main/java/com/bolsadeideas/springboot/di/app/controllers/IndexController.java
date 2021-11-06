package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
  private MiServicio miServicio = new MiServicio();
  @GetMapping({"/","","/index"})
  public String index(Model model) {
    //Enviando un recurso sin utilizar inyección de dependencias
    model.addAttribute("objeto", miServicio.operacion());
    return "index";
  }
}
