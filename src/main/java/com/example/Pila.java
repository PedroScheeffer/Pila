package com.example;

public class Pila<T> extends Lista<T>{
    public void push(Nodo<T> nodo){ 
        insertar(nodo);
    }
    public Nodo<T> pop(){
        if(esVacia()){
            return null;
        }
        Nodo<T> actual = getPrimero();
        setPrimero(actual.getSiguiente());
        actual.setSiguiente(null);
        return actual; 
    }
    public boolean vacio(){
        return esVacia();
    }
    public Nodo<T> peek(){

        return getPrimero();
    }

}