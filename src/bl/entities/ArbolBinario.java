package bl.entities;

public class ArbolBinario {
    private Nodo raiz;
    private String resultado;

    public ArbolBinario() {
        raiz = null;
        resultado = "";
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            resultado += n.getDato() + ",";
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }

    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            resultado += n.getDato() + ",";
            inorden(n.getDerecha());
        }

    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            resultado += n.getDato() + ",";
        }

    }

    public String preorden() {
        this.preorden(this.raiz);
        return resultado;

    }

    public String inorden() {
        this.inorden(this.raiz);
        return resultado;
    }

    public String postorden() {

        this.postorden(this.raiz);
        return resultado;
    }


}
