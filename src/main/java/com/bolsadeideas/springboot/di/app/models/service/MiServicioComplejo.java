package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
//@Primary indica que este servicio será el que se utilice por defecto
public class MiServicioComplejo implements IServicio {
  @Override
  public String operacion(){
    return "Ejecutando un proceso importante complicado...";
  }
}
