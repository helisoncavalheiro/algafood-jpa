package com.helison.algafoodjpa.jpa.restaurante;

import com.helison.algafoodjpa.AlgafoodApplication;
import com.helison.algafoodjpa.domain.model.Restaurante;
import com.helison.algafoodjpa.domain.repository.RestauranteRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaRestauranteMain {
  
  public static void main(String[] args){
    ApplicationContext context = new SpringApplicationBuilder(AlgafoodApplication.class)
                                      .web(WebApplicationType.NONE)
                                      .run(args);

    RestauranteRepository restauranteRepository = context.getBean(RestauranteRepository.class);
    
    Restaurante restaurante = restauranteRepository.obter(3L);

    System.out.println(String.format("Restaurante %s é da cozinha %s", restaurante.getNome(), restaurante.getCozinha().getNome()));
  }
}
