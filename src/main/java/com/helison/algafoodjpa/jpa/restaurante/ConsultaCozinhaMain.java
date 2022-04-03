package com.helison.algafoodjpa.jpa.restaurante;

import java.util.List;

import com.helison.algafoodjpa.AlgafoodApplication;
import com.helison.algafoodjpa.domain.model.Restaurante;
import com.helison.algafoodjpa.domain.repository.RestauranteRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultaCozinhaMain {

  public static void main(String[] args) {
    ApplicationContext context = new SpringApplicationBuilder(AlgafoodApplication.class)
        .web(WebApplicationType.NONE)
        .run(args);
    RestauranteRepository restauranteRepository = context.getBean(RestauranteRepository.class);

    List<Restaurante> restaurantes = restauranteRepository.listar();

    for (Restaurante restaurante : restaurantes) {
      System.out.println(
          String.format("Restaurante %s é da cozinha %s", restaurante.getNome(), restaurante.getCozinha().getNome()));
    }

  }

}
