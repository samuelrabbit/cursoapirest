package com.cursoapirestrest.modulos.pessoa_fisica.dto;

import java.io.Serializable;
import java.util.Objects;

public class PessoaFisicaDTO implements Serializable {

  private static final long serialVersionUID = 1;
  private Long id;
  private String nome;
  private String email;

  public PessoaFisicaDTO() {}

  public PessoaFisicaDTO(Long id, String nome, String email) {
    this.id = id;
    this.nome = nome;
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof PessoaFisicaDTO)) {
      return false;
    }
    PessoaFisicaDTO pessoaFisicaDTO = (PessoaFisicaDTO) o;
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
}
