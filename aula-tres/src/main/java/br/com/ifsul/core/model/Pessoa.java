package br.com.ifsul.core.model;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private String nascimento;
    private Cidade cidade;

    public Pessoa(String nome, String nascimento, Cidade cidade) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cidade = cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }


    @Override
    public String toString() {
        return "Nome" + this.nome + "\n"
            + "Nascimento:" + this.nascimento + "\n"
            + "Cidade:" + this.cidade + "\n";
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || this.getClass() != object.getClass()) return false;
  
      Pessoa pessoa = (Pessoa) object;
  
      return  Objects.equals(nome, pessoa.nome) &&
              Objects.equals(nascimento, pessoa.nascimento) &&
              Objects.equals(cidade, pessoa.cidade);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(nome, nascimento, cidade);
    }
}