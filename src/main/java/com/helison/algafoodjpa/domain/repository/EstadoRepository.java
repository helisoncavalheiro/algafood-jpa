package com.helison.algafoodjpa.domain.repository;

import java.util.List;

import com.helison.algafoodjpa.domain.model.Estado;

public interface EstadoRepository {
  
  public Estado obter(Long estadoId);
  public List<Estado> listar();
  public Estado salvar(Estado formaPagamento);
  public void excluir(Estado formaPagamento);

}