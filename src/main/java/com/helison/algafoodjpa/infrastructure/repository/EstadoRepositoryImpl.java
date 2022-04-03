package com.helison.algafoodjpa.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.helison.algafoodjpa.domain.model.Estado;
import com.helison.algafoodjpa.domain.repository.EstadoRepository;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EstadoRepositoryImpl implements EstadoRepository{

  @PersistenceContext
  private EntityManager manager;

  @Override
  public List<Estado> listar() {
    return manager.createQuery("from Estado", Estado.class).getResultList();
  }

  @Override
  public Estado obter(Long estadoId) {
    return manager.find(Estado.class, estadoId);
  }

  @Override
  @Transactional
  public Estado salvar(Estado estado) {
    return manager.merge(estado);
  }

  @Override
  @Transactional
  public void excluir(Estado estado) {
    estado = manager.find(Estado.class, estado.getId());
    
    manager.remove(estado);
  }
  
  
}
