package com.bolsadeideas.springboot.di.app;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean("miServicioSimple")
  public IServicio registratMiServicio() {
    return new MiServicio();
  }
  
  @Bean("miServicioComplejo")
  public IServicio registratMiServicioComplejo() {
    return new MiServicioComplejo();
  }
}
