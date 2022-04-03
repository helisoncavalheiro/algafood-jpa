package com.helison.algafoodjpa.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.helison.algafoodjpa.domain.model.FormaPagamento;
import com.helison.algafoodjpa.domain.repository.FormaPagamentoRepository;

import org.springframework.stereotype.Component;

@Component
public class FormaPagamentoImpl implements FormaPagamentoRepository{

  @PersistenceContext
  private EntityManager manager;

  @Override
  public FormaPagamento obter(Long formaPagamentoId) {
    return manager.find(FormaPagamento.class, formaPagamentoId);
  }

  @Override
  public List<FormaPagamento> listar() {
    return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
  }

  @Override
  public FormaPagamento salvar(FormaPagamento formaPagamento) {
    return manager.merge(formaPagamento);
  }

  @Override
  public void excluir(FormaPagamento formaPagamento) {
    formaPagamento = manager.find(FormaPagamento.class, formaPagamento.getId());
    manager.remove(formaPagamento);
  }
  
}
