package com.helison.algafoodjpa.domain.repository;

import java.util.List;

import com.helison.algafoodjpa.domain.model.Cidade;

public interface CidadeRepository {

  public Cidade obter(Long cidadeId);
  public List<Cidade> listar();
  public Cidade salvar(Cidade cidade);
  public void excluir(Cidade cidade);
  
}
