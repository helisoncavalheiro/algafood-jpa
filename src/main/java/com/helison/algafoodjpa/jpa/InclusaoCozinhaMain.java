package com.helison.algafoodjpa.jpa;


import com.helison.algafoodjpa.AlgafoodApplication;
import com.helison.algafoodjpa.domain.model.Cozinha;
import com.helison.algafoodjpa.domain.repository.CozinhaRepository;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InclusaoCozinhaMain {
  
  public static void main(String[] args){
    ApplicationContext context = new SpringApplicationBuilder(AlgafoodApplication.class)
                                      .web(WebApplicationType.NONE)
                                      .run(args);


    CozinhaRepository cozinhaRepository = context.getBean(CozinhaRepository.class);

    Cozinha cozinha1 = new Cozinha();
    cozinha1.setNome("Brasileira");

    Cozinha cozinha2 = new Cozinha();
    cozinha2.setNome("Chinesa");

    cozinhaRepository.salvar(cozinha1);
    cozinhaRepository.salvar(cozinha2);
  }
}
