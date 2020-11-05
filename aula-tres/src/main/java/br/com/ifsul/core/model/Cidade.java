package br.com.ifsul.core.model;

import java.util.Objects;

public class Cidade {

  private String nome;
  private String sigla;
  private Estado estado;

  public Cidade(String nome, String sigla, Estado estado) {
    this.nome = nome;
    this.sigla = sigla;
    this.estado = estado;
  }

  public Cidade(Estado estado) {
    this.estado = estado;
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

  public Estado getEstado() {
    return this.estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return (
      "Cidade:" +
      this.nome +
      "\n" +
      "Sigla:" +
      this.sigla +
      "\n" +
      "Estado:" +
      this.estado
    );
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || this.getClass() != object.getClass()) return false;

    Cidade cidade = (Cidade) object;

    return  Objects.equals(nome, cidade.nome) &&
            Objects.equals(sigla, cidade.sigla) &&
            Objects.equals(estado, cidade.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, sigla, estado);
  }
}
