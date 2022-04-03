package com.helison.algafoodjpa.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.helison.algafoodjpa.domain.model.Permissao;
import com.helison.algafoodjpa.domain.repository.PermissaoRepository;

import org.springframework.stereotype.Component;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository{
  @PersistenceContext
  private EntityManager manager;

  @Override
  public Permissao obter(Long permissaoId) {
    return manager.find(Permissao.class, permissaoId);
  }

  @Override
  public List<Permissao> listar() {
    return manager.createQuery("from Permissao", Permissao.class).getResultList();
  }

  @Override
  public Permissao salvar(Permissao permissao) {
    return manager.merge(permissao);
  }

  @Override
  public void excluir(Permissao permissao) {
    permissao = manager.find(Permissao.class, permissao.getId());
    manager.remove(permissao);
  }
}
