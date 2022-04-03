package com.helison.algafoodjpa.domain.repository;

import java.util.List;

import com.helison.algafoodjpa.domain.model.Permissao;

public interface PermissaoRepository {
  
  public Permissao obter(Long permissaoId);
  public List<Permissao> listar();
  public Permissao salvar(Permissao permissao);
  public void excluir(Permissao permissao);

}
