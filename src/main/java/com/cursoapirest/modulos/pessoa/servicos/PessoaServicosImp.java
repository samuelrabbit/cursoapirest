package com.cursoapirest.modulos.pessoa.servicos;

import com.cursoapirest.modulos.pessoa.model.Pessoa;
import com.cursoapirest.modulos.pessoa.repositorio.PessoaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServicosImp implements PessoaServicos {

  @Autowired
  PessoaRepositorio pessoaRepositorio;

  @Override
  public List<Pessoa> findAll() {
    return pessoaRepositorio.findAll();
  }
}
