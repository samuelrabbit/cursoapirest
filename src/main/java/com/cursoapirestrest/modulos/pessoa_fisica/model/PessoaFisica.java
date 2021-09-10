package com.cursoapirestrest.modulos.pessoa_fisica.model;

import java.io.Serializable;
import java.util.Objects;

public class PessoaFisica implements Serializable {

  private static final long serialVersionUID = 1;
  private Long id;
  private String nome;
  private String email;
  private String cpf;
  private String senha;

  public PessoaFisica() {}

  public PessoaFisica(
    Long id,
    String nome,
    String email,
    String cpf,
    String senha
  ) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.senha = senha;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof PessoaFisica)) {
      return false;
    }
    PessoaFisica pessoaFisicaDTO = (PessoaFisica) o;
    return (Objects.equals(id, pessoaFisicaDTO.id));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, email);
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}
