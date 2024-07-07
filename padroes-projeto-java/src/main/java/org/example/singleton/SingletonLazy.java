package org.example.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia = new SingletonLazy();

    public SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        return instancia;
    }
}
