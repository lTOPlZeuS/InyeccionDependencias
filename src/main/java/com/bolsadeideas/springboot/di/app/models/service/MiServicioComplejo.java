package com.bolsadeideas.springboot.di.app.models.service;

//@Component("miServicioComplejo")
//@Primary indica que este servicio será el que se utilice por defecto
public class MiServicioComplejo implements IServicio {
  @Override
  public String operacion(){
    return "Ejecutando un proceso importante complicado...";
  }
}
