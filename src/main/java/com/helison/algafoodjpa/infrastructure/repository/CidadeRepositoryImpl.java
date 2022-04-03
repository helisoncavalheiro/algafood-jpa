package com.helison.algafoodjpa.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.helison.algafoodjpa.domain.model.Cidade;
import com.helison.algafoodjpa.domain.repository.CidadeRepository;

import org.springframework.stereotype.Component;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {
  
  @PersistenceContext
  private EntityManager manager;

  @Override
  public Cidade obter(Long cidadeId) {
    return manager.find(Cidade.class, cidadeId);
  }

  @Override
  public List<Cidade> listar() {
    return manager.createQuery("from FormaPagamento", Cidade.class).getResultList();
  }

  @Override
  public Cidade salvar(Cidade cidade) {
    return manager.merge(cidade);
  }

  @Override
  public void excluir(Cidade cidade) {
    cidade = manager.find(Cidade.class, cidade.getId());
    manager.remove(cidade);
  }
}
