package org.example;

import org.example.Data.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Curso de Java básico", 8);
        Curso curso2 = new Curso("JavaScript", "Curso de JavaScript avançado", 16);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria sobre Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.getCursos().add(curso1);
        bootcamp.getCursos().add(curso2);
        bootcamp.getMentorias().add(mentoria1);

        Dev dev1 = new Dev("Patrik");
        Dev dev2 = new Dev("João");

        dev1.inscreverCurso(curso1);
        dev1.inscreverCurso(curso2);
        dev1.inscreverMentoria(mentoria1);

        dev2.inscreverCurso(curso1);
        dev2.inscreverMentoria(mentoria1);

        bootcamp.inscreverDev(dev1);
        bootcamp.inscreverDev(dev2);

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Devs inscritos: " + bootcamp.getDevsInscritos());
        System.out.println("Cursos do bootcamp: " + bootcamp.getCursos());
        System.out.println("Mentorias do bootcamp: " + bootcamp.getMentorias());

        dev1.concluirCurso(curso1);
        dev1.concluirMentoria(mentoria1);

        System.out.println("Dev " + dev1.getNome() + " após concluir atividades:");
        System.out.println("Cursos concluidos: " + dev1.getCursosConcluidos());
        System.out.println("Mentorias concluidas: " + dev1.getMentoriasConcluidas());
    }
}
