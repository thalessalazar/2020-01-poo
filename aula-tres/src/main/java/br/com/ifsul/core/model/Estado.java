package br.com.ifsul.core.model;

public class Estado {

    private String nome;
    private String sigla;
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

    @Override
    public String toString() {
        return "Estado:" + this.nome + "\n"
            + "Sigla:" + this.sigla + "\n"
            + "Pais:" + this.pais;
    }

}