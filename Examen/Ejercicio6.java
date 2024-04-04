public class Ejercicio6 {
    /*
     * Verificar si un árbol binario es un árbol de búsqueda
     */
    private Nodo raiz;

    public Ejercicio6(Nodo raiz) {
        this.raiz = raiz;
    }

    public boolean esBusqueda() {
        return esBusqueda(raiz);
    }

    public boolean esBusqueda(Nodo nodo) {
        if (nodo == null) {
            return true;
        }
        // Verificar nodo hijo izquierdo, si es mayor ya no es binario
        if (nodo.getIzq() != null && nodo.getIzq().getDato() > nodo.getDato()) {
            return false;
        }
        // Verificar nodo hijo derecha, si es menor ya no es binario
        if (nodo.getDer() != null && nodo.getDer().getDato() < nodo.getDato()) {
            return false;
        }
        // Llamada recursiva para subarboles izquierdo y derecho
        return esBusqueda(nodo.getIzq()) && esBusqueda(nodo.getDer());
    }

    public void print() {
        System.out.println("Es árbol de búsqueda?: " + esBusqueda());
        print("", raiz, false);
    }

    public void print(String prefix, Nodo n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.getDer(), false);
            System.out.println(prefix + ("|-- ") + n.getDato());
            print(prefix + "     ", n.getIzq(), true);
        }
    }
}
