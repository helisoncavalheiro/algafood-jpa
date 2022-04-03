package com.helison.algafoodjpa.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.helison.algafoodjpa.domain.model.Cozinha;
import com.helison.algafoodjpa.domain.repository.CozinhaRepository;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {
  
  @PersistenceContext
  private EntityManager manager;
  
  @Override
  public List<Cozinha> listar(){
    return manager.createQuery("from Cozinha", Cozinha.class)
                .getResultList();
  }

  @Transactional
  @Override
  public Cozinha salvar(Cozinha cozinha){
    return manager.merge(cozinha);
  }

  @Override
  public Cozinha buscar(Long cozinhaId){
    return manager.find(Cozinha.class, cozinhaId);
  }

  @Transactional
  @Override
  public void remover(Cozinha cozinha){
    cozinha = buscar(cozinha.getId());
    manager.remove(cozinha);
  }
}
