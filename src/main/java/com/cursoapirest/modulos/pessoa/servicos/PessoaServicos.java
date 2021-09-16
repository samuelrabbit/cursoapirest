package com.cursoapirest.modulos.pessoa.servicos;

import com.cursoapirest.modulos.pessoa.model.Pessoa;
import java.util.List;

public interface PessoaServicos {
   List<Pessoa> findAll();
   Pessoa buscarPorId(Long id);
   Pessoa inserir(Pessoa pessoa);
}
