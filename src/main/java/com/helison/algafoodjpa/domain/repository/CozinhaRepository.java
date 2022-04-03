package com.helison.algafoodjpa.domain.repository;

import java.util.List;

import com.helison.algafoodjpa.domain.model.Cozinha;

public interface CozinhaRepository {
  
  List<Cozinha> listar();
  Cozinha buscar(Long cozinhaId);
  Cozinha salvar(Cozinha cozinha);
  void remover(Cozinha cozinha);

}
