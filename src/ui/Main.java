package ui;

import bl.entities.ArbolBinario;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insertar(32);
        arbolBinario.insertar(68);
        arbolBinario.insertar(12);
        arbolBinario.insertar(75);
        arbolBinario.insertar(6);
        arbolBinario.insertar(42);
        arbolBinario.insertar(84);
        arbolBinario.insertar(99);
        arbolBinario.insertar(69);
        arbolBinario.insertar(7);
        arbolBinario.insertar(27);
        arbolBinario.insertar(73);
        arbolBinario.preorden();
        System.out.println("============================");
        arbolBinario.postorden();
        System.out.println("============================");
        arbolBinario.inorden();
    }
}
