package com.helison.algafoodjpa.jpa;


import com.helison.algafoodjpa.AlgafoodApplication;
import com.helison.algafoodjpa.domain.model.Cozinha;
import com.helison.algafoodjpa.domain.repository.CozinhaRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AtualizacaoCozinhaMain {
  
  public static void main(String[] args){
    ApplicationContext context = new SpringApplicationBuilder(AlgafoodApplication.class)
                                      .web(WebApplicationType.NONE)
                                      .run(args);


    CozinhaRepository cozinhaRepository = context.getBean(CozinhaRepository.class);

    Cozinha cozinha = new Cozinha();
    cozinha.setId(1L);
    cozinha.setNome("Brasileira");

    cozinhaRepository.salvar(cozinha);
  }
}
