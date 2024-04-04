public class Ejercicio5 {
    /*
     * Implementar un método que encuentre el nodo con el valor más cercano a un
     * valor dado en un árbol binario.
     */
    private Nodo raiz;
    private int valor;

    public Ejercicio5(Nodo raiz, int valor) {
        this.raiz = raiz;
        this.valor = valor;
    }

    public Nodo valorMasCercano() {
        return valorMasCercano(raiz, valor);
    }

    public Nodo valorMasCercano(Nodo nodo, int valor) {
        // Caso base: Nodo Null
        if (nodo == null) {
            return null;
        }
        if (nodo.getDato() == valor) {
            return nodo;
        }

        Nodo izq = valorMasCercano(nodo.getDer(), valor);
        Nodo der = valorMasCercano(nodo.getIzq(), valor);

    }

    public void print() {
        Nodo mascercano = valorMasCercano();

        System.out.println(mascercano.getDato());
    }
}
