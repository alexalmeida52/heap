package br.com.waldson.aula12;

import java.awt.event.ActionListener;

public class Pessoa {
    private String nome;
    private int idade;
    private FilaBanco filaBanco;

    public FilaBanco getFilaBanco() {
        return filaBanco;
    }

    public void setFilaBanco(FilaBanco filaBanco) {
        this.filaBanco = filaBanco;
    }

    public Pessoa(String nome, int idade) {
        this.nome  = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        filaBanco.order(this);
    }

}
