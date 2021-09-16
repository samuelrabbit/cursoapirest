package com.cursoapirest.modulos.pessoa.rest;

import com.cursoapirest.modulos.pessoa.model.Pessoa;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface PessoaApi {
  ResponseEntity<List<Pessoa>> ListarPessoas();
  ResponseEntity<Pessoa> BuscarPorId(Long id);
  ResponseEntity<Pessoa> Adcionar(Pessoa pessoa);
}
