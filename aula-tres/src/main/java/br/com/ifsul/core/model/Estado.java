package br.com.ifsul.core.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Estado {

    private String nome;
    private String sigla;
    private List<Cidade> cidade = new ArrayList<>();
    private Pais pais;

    public Estado(){}

    public Estado(Pais pais) {
        this.pais = pais;
    }

    public Estado(String nome, String sigla, Pais pais){
        this.nome = nome;
        this.sigla = sigla;
        this.pais = pais;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSigla(){
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setCidade(List<Cidade> cidade) {
        this.cidade = cidade;
    }

    public List<Cidade> getCidade() {
        return cidade;
    }
    
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || this.getClass() != object.getClass()) return false;
  
      Estado estado = (Estado) object;
  
      return  Objects.equals(nome, estado.nome) &&
              Objects.equals(sigla, estado.sigla) &&
              Objects.equals(pais, estado.pais);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(nome, sigla, pais);
    }

    public void addCidade(List<Cidade> cidade) {
        this.cidade.addAll(cidade);
    }

}