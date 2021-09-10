package com.cursoapirest.modulos.pessoa.repositorio;

import com.cursoapirest.modulos.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {}
