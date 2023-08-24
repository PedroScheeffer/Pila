package com.example;

import java.util.Stack;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

 public static boolean controlCorchetes(String listaDeEntrada) {
        Pila pila = new Pila();

        for (char caracter : listaDeEntrada.toCharArray()) {
            if (caracter == '{') {
                Nodo nodo = new Nodo(1,"{");
                pila.push(nodo);
            } else if (caracter == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String entrada = "texto{más{ejemplo}}";
        boolean resultado = controlCorchetes(entrada);
        
        if (resultado) {
            System.out.println("Los corchetes están balanceados.");
        } else {
            System.out.println("Los corchetes no están balanceados.");
        }
    }

}
