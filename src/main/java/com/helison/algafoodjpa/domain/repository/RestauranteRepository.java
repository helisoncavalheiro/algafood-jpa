package com.helison.algafoodjpa.domain.repository;

import java.util.List;

import com.helison.algafoodjpa.domain.model.Restaurante;

public interface RestauranteRepository {
  
  List<Restaurante> listar();
  Restaurante obter(Long restauranteId);
  Restaurante salvar(Restaurante restaurante);
  void excluir(Restaurante restaurante);
}
