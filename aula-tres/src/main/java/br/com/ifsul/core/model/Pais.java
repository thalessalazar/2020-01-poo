package br.com.ifsul.core.model;

import java.util.Objects;

public class Pais {

  private String nome;
  private String sigla;

  public Pais() {}

  public Pais(String nome, String sigla) {
    this.nome = nome;
    this.sigla = sigla;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSigla() {
    return this.sigla;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  @Override
  public String toString() {
    return "Pais:" + this.nome + "\n" + "Sigla:" + this.sigla;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || this.getClass() != object.getClass()) return false;

    Pais pais = (Pais) object;

    return Objects.equals(nome, pais.nome) && Objects.equals(sigla, pais.sigla);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, sigla);
  }
}
