package com.cursoapirest.modulos.pessoa.servicos;

import com.cursoapirest.exception.EntidadeNotFoundException;
import com.cursoapirest.modulos.pessoa.model.Pessoa;
import com.cursoapirest.modulos.pessoa.repositorio.PessoaRepositorio;
import java.util.List;
import java.util.Optional;

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
  @Override
  public Pessoa buscarPorId(Long id) {
  	Optional<Pessoa> obj = pessoaRepositorio.findById(id);
  	return obj.orElseThrow(()->new EntidadeNotFoundException("Id not found "+ id));
  }
  
  @Override
  public Pessoa inserir(Pessoa pessoa) {
  	return pessoaRepositorio.save(pessoa);
  }
}
