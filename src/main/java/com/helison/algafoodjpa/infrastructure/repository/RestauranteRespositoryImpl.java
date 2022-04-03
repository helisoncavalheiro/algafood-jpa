package com.helison.algafoodjpa.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.helison.algafoodjpa.domain.model.Restaurante;
import com.helison.algafoodjpa.domain.repository.RestauranteRepository;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RestauranteRespositoryImpl implements RestauranteRepository{

  @PersistenceContext
  private EntityManager manager;

  @Override
  public List<Restaurante> listar() {
    return manager.createQuery("from Restaurante", Restaurante.class).getResultList();
  }

  @Override
  public Restaurante obter(Long restauranteId) {
    return manager.find(Restaurante.class, restauranteId);
  }

  @Override
  @Transactional
  public Restaurante salvar(Restaurante restaurante) {
    return manager.merge(restaurante);
  }

  @Override
  @Transactional
  public void excluir(Restaurante restaurante) {
    restaurante = manager.find(Restaurante.class, restaurante.getId());
    
    manager.remove(restaurante);
  }
  
  
}
