package ui;

import bl.logic.GestorArbolBinario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Controller {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    GestorArbolBinario gestorArbolBinario = new GestorArbolBinario();

    public Controller() {
    }

    public void start() throws IOException {
        boolean salir = false;
        do {
            imprimirMenu();
            int opcion = leerOpcion();
            salir = ejecutarOpcion(opcion);

        } while (!salir);


    }
    public void imprimirMenu() {
        System.out.println("======= MENU DEL PROGRAMA ======= ");
        System.out.println("");
        System.out.println("======= ARBOL BINARIO ======= ");
        System.out.println("1. Insertar");
        System.out.println("2. Visualizar arbol en PRE ORDEN");
        System.out.println("3. Visualizar arbol en POST ORDEN");
        System.out.println("4. Visualizar arbol en IN ORDEN");
        System.out.println("5. Salir del programa");

    }

    public int leerOpcion() throws IOException {
        System.out.println("Ingrese la opcion que desea: ");
        return Integer.parseInt(in.readLine());
    }

    public boolean ejecutarOpcion(int opcion) throws IOException {
        boolean salir = false;
        int dato = 0;
        switch (opcion) {
            case 1:
               boolean out = false;
               do {
                   System.out.print("Digite el numero o ingrese (-1) para salir: ");
                   dato = Integer.parseInt(in.readLine());
                   if (dato == -1) {
                       out = true;
                   } else {
                       gestorArbolBinario.insertar(dato);
                   }

               } while (!out);
                break;
            case 2:
                System.out.println("============ ARBOL BINARIO EN PRE ORDEN ============");
                System.out.println(gestorArbolBinario.visualizarPreOrden());
                break;

            case 3:
                System.out.println("============ ARBOL BINARIO EN POST ORDEN ============");
                System.out.println(gestorArbolBinario.visualizarPostOrden());
                break;

            case 4:
                System.out.println("============ ARBOL BINARIO EN IN ORDEN ============");
                System.out.println(gestorArbolBinario.visualizarInOrden());

                break;

            case 5:
                salir = true;
                break;
        }

        return salir;
    }

}
