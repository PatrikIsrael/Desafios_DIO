package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContatos(candidato);
        }
    }

    static void entrandoEmContatos(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!!");
            }
        }while (continuarTentando && tentativasRealizadas <3);
            if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato+ " NA " + tentativasRealizadas +" TENTATIVA");
            else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato +", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas +" REALIZADAS");
        }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia","Paulo", "Augusto"};

        System.out.println("Imprimindo a lista de candidatos  informando o índice do elemento");
        for(int indice=0; indice< candidatos.length;indice++){
            System.out.println("O candidatos de número "+ (indice+1) +" é " +candidatos[indice]);
        }
        System.out.println("Forma abreviada da interação for each");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }


    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato(a) " + candidato + " solicitou esse valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato +" foi selecionado");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}