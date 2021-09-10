package com.cursoapirest.modulos.pessoa.rest;

import com.cursoapirest.modulos.pessoa.model.Pessoa;
import com.cursoapirest.modulos.pessoa.servicos.PessoaServicos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaRest implements PessoaApi {

  @Autowired
  PessoaServicos pessoaServicos;

  @GetMapping
  public ResponseEntity<List<Pessoa>> ListarPessoas() {
    List<Pessoa> list = pessoaServicos.findAll();
    return ResponseEntity.ok().body(list);
  }
}
