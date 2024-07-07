package org.example;

import org.example.facade.Facade;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;
import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {
        //testes Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // testes Robo

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //teste facede

        Facade facade = new Facade();
        facade.migrarCliente("Teste", "12345678");
    }


}