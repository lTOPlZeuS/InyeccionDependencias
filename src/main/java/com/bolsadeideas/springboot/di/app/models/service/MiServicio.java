package com.bolsadeideas.springboot.di.app.models.service;

// @Component("miServicioSimple")
public class MiServicio implements IServicio {
  @Override
  public String operacion(){
    return "Ejecutando un proceso importante simple...";
  }
}
