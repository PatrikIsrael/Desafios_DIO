package org.example;

import org.example.Data.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando ReprodutorMusical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
