package org.example.Data;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaPoupanca() {
        super(1, SEQUENCIAL++, 0);
    }
}
