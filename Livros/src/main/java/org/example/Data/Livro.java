package org.example.Data;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicação;

    public Livro() {
    }

    public Livro(String livro, String autor, int anoPublicacao) {
        this.titulo = livro;
        this.autor = autor;
        this.anoPublicação = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicação;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicação = anoPublicação;
    }
}
