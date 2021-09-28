package bl.logic;

import bl.entities.ArbolBinario;

public class GestorArbolBinario {

    private ArbolBinario arbolBinario;
    private String resultado;

    public GestorArbolBinario() {
        arbolBinario = new ArbolBinario();
    }

    public ArbolBinario getArbolBinario() {
        return arbolBinario;
    }

    public void setArbolBinario(ArbolBinario arbolBinario) {
        this.arbolBinario = arbolBinario;
    }

    public void insertar(int num) {
        arbolBinario.insertar(num);
    }

    public String visualizarInOrden() {
        resultado = arbolBinario.inorden();
        arbolBinario.setResultado("");
        return resultado;
    }

    public String visualizarPostOrden() {
        resultado = arbolBinario.postorden();
        arbolBinario.setResultado("");
        return resultado;
    }

    public String visualizarPreOrden() {
        resultado = arbolBinario.preorden();
        arbolBinario.setResultado("");
        return resultado;
    }
}
