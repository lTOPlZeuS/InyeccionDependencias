package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
  @Autowired
  private MiServicio miServicio;
  
  @GetMapping({"/","","/index"})
  public String index(Model model) {
    //Enviando un recurso sin utilizar inyección de dependencias
    model.addAttribute("objeto", miServicio.operacion());
    return "index";
  }
}
