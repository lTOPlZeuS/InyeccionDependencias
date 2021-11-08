package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
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

  @Bean("iteamsFactura")
  public List<ItemFactura> registratItemFactura() {
    Producto producto = new Producto("Camara Sony", 200);
    Producto producto2 = new Producto("Camara Canon", 300);
    Producto producto3 = new Producto("Camara Nikon", 400);

    ItemFactura itemFactura = new ItemFactura(producto, 2);
    ItemFactura itemFactura2 = new ItemFactura(producto2, 1);
    ItemFactura itemFactura3 = new ItemFactura(producto3, 3);

    return Arrays.asList(itemFactura, itemFactura2, itemFactura3);
  }

  @Bean("iteamsFacturaOficina")
  public List<ItemFactura> registratItemFacturaOficina() {
    Producto producto = new Producto("Escritoprio ajustable", 8000);
    Producto producto2 = new Producto("Silla herman", 6000);
    Producto producto3 = new Producto("Papeleria", 400);

    ItemFactura itemFactura = new ItemFactura(producto, 2);
    ItemFactura itemFactura2 = new ItemFactura(producto2, 1);
    ItemFactura itemFactura3 = new ItemFactura(producto3, 3);

    return Arrays.asList(itemFactura, itemFactura2, itemFactura3);
  }
}
