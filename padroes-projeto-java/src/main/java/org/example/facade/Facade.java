package org.example.facade;

import org.example.subsistema_1.Sistema1;
import org.example.subsistema_2.CepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep){

        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        Sistema1.gravarCliente(nome, cep,cidade,estado);
    }
}
