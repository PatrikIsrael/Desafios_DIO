package org.example.Data;


public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String paginaAtual;

    // Implementação de ReprodutorMusical
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Reproduzindo música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para pausar");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Página atualizada: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar");
        }
    }
}

