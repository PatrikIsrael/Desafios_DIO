package org.example.subsistema_2;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    public CepAPI() {
        super();
    }

    public static CepAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String Cep){
        return "Candelária";
    }
    public String recuperarEstado(String Cep){
        return "Rio Grando do Sul";
    }
}
