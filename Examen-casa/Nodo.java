public class Nodo {
    private int valor;
    private Nodo izq;
    private Nodo der;

    public Nodo() {
        valor = -1;
        izq = null;
        der = null;

    }

    public Nodo(int valor) {
        this.valor = valor;
        izq = null;
        der = null;

    }

    public Nodo getIzq() {

        return izq;
    }

    public Nodo getDer() {

        return der;
    }

    public void setIzq(Nodo i) {
        izq = i;
    }

    public void setDer(Nodo i) {
        der = i;
    }

    public int getDato() {

        return valor;

    }

    public void setDato(int dat) {

        valor = dat;
    }

}