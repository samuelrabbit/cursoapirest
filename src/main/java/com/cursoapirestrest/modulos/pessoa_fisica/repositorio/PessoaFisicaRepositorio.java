package com.cursoapirestrest.modulos.pessoa_fisica.repositorio;

import com.cursoapirestrest.modulos.pessoa_fisica.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepositorio
  extends JpaRepository<PessoaFisica, Long> {}
