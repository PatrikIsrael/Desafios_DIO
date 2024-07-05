package org.example.Data;

public class Cliente {

    private String nome;
    private String cpf;
    private String tipoConta;

    public Cliente(String nome, String cpf, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}
