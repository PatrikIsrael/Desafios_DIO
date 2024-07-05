package org.example.Data;

import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosConcluidos = new HashSet<>();
    private Set<Curso> cursosInscritos = new HashSet<>();
    private Set<Mentoria> mentoriasConcluidas = new HashSet<>();
    private Set<Mentoria> mentoriasInscritas = new HashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(Set<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(Set<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Set<Mentoria> getMentoriasConcluidas() {
        return mentoriasConcluidas;
    }

    public void setMentoriasConcluidas(Set<Mentoria> mentoriasConcluidas) {
        this.mentoriasConcluidas = mentoriasConcluidas;
    }

    public Set<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }

    public void setMentoriasInscritas(Set<Mentoria> mentoriasInscritas) {
        this.mentoriasInscritas = mentoriasInscritas;
    }

    public void inscreverCurso(Curso curso) {
        this.cursosInscritos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        this.mentoriasInscritas.add(mentoria);
    }

    public void concluirCurso(Curso curso) {
        if (this.cursosInscritos.remove(curso)) {
            this.cursosConcluidos.add(curso);
        }
    }

    public void concluirMentoria(Mentoria mentoria) {
        if (this.mentoriasInscritas.remove(mentoria)) {
            this.mentoriasConcluidas.add(mentoria);
        }
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", cursosConcluidos=" + cursosConcluidos +
                ", cursosInscritos=" + cursosInscritos +
                ", mentoriasConcluidas=" + mentoriasConcluidas +
                ", mentoriasInscritas=" + mentoriasInscritas +
                '}';
    }
}
