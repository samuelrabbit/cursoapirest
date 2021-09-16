package com.cursoapirest.modulos.pessoa.rest;

import com.cursoapirest.modulos.pessoa.model.Pessoa;
import com.cursoapirest.modulos.pessoa.servicos.PessoaServicos;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/pessoafisica")
public class PessoaRest implements PessoaApi {

  @Autowired
  PessoaServicos pessoaServicos;

  @GetMapping
  public ResponseEntity<List<Pessoa>> ListarPessoas() {
    List<Pessoa> list = pessoaServicos.findAll();
    return ResponseEntity.ok().body(list);
  }
  @GetMapping(value = "/{id}")
  public ResponseEntity<Pessoa> BuscarPorId(@PathVariable Long id){
  	Pessoa pessoa = pessoaServicos.buscarPorId(id);
  	return ResponseEntity.ok().body(pessoa);
  }
  @PostMapping
  public ResponseEntity<Pessoa> Adcionar(@RequestBody Pessoa pessoa){
  	pessoa = pessoaServicos.inserir(pessoa);
  	URI url = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
  			.buildAndExpand(pessoa.getId()).toUri();
  	return ResponseEntity.created(url).body(pessoa);
  }
}
