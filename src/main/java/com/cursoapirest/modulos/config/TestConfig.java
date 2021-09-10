package com.cursoapirest.modulos.config;

import com.cursoapirest.modulos.pessoa.model.Pessoa;
import com.cursoapirest.modulos.pessoa.repositorio.PessoaRepositorio;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private PessoaRepositorio PessoaRepositorio;

  @Override
  public void run(String... args) throws Exception {
    Pessoa Pessoa1 = new Pessoa(
      null,
      "Maria da Silva",
      "mariadasilva@gmail.com",
      "932.830.370-27"
    );
    Pessoa Pessoa2 = new Pessoa(
      null,
      "João da Silva",
      "joaodasilva@gmail.com",
      "848.102.930-09"
    );

    PessoaRepositorio.saveAll(Arrays.asList(Pessoa1, Pessoa2));
  }
}
