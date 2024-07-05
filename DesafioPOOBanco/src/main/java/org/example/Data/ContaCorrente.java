package org.example.Data;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente() {
        super(1, SEQUENCIAL++, 0);
    }
}
