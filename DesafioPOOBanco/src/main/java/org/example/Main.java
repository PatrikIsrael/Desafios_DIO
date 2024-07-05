package org.example;

import org.example.Data.Banco;
import org.example.Data.ContaCorrente;
import org.example.Data.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");
        System.out.println("Banco: " + banco.getNome());

        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("Conta Corrente:");
        System.out.println("Agência: " + contaCorrente.getAgencia());
        System.out.println("Número: " + contaCorrente.getNumero());
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());

        contaCorrente.depositar(500.0);
        System.out.println("Saldo após depósito: " + contaCorrente.getSaldo());

        contaCorrente.sacar(200.0);
        System.out.println("Saldo após saque: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        System.out.println("\nConta Poupança:");
        System.out.println("Agência: " + contaPoupanca.getAgencia());
        System.out.println("Número: " + contaPoupanca.getNumero());
        System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());

        contaPoupanca.depositar(1000.0);
        System.out.println("Saldo após depósito: " + contaPoupanca.getSaldo());

        contaPoupanca.sacar(300.0);
        System.out.println("Saldo após saque: " + contaPoupanca.getSaldo());

        System.out.println("\nTransferência de Conta Corrente para Conta Poupança:");
        contaCorrente.transferir(100.0, contaPoupanca);
        System.out.println("Saldo Conta Corrente após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após transferência: " + contaPoupanca.getSaldo());
    }
}
