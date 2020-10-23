package br.com.ifsul.core.model;

import java.util.Date;

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