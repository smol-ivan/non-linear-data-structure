public class EjercicioPar {
    /*
     * Implementar la operacion de "poda" en un arbol binario
     * Implementar un método podar(int dato) que elimine un nodo y sus subárboles del árbol.
     */

    private Nodo raiz;
    private int dato;

    public EjercicioPar(Nodo raiz, int dato) {
        this.raiz = raiz;
        this.dato = dato;
    }

    public void podar() {
        podar(raiz, dato);
    }

    public void podar(Nodo nodo, int dato) {
        // Caso base: Si el nodo es nulo, regresamos
        if (nodo == null) {
            return;
        }
        // Si el nodo izquierdo es el nodo a podar, lo eliminamos
        if (nodo.getIzq() != null && nodo.getIzq().getDato() == dato) {
            nodo.setIzq(null);
        } 
        // Si el nodo derecho es el nodo a podar, lo eliminamos
        else if (nodo.getDer() != null && nodo.getDer().getDato() == dato) {
            nodo.setDer(null);
        } 
        // Si no es el nodo a podar, seguimos buscando haciendo llamadas recursivas
        // a los subarboles izquierdo y derecho
        else {
            podar(nodo.getIzq(), dato);
            podar(nodo.getDer(), dato);
        }
    }

    public void print() {
        System.out.println("Arbol antes de podar: ");
        print("", raiz, false);
        podar();
        System.out.println("Arbol despues de podar: ");
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
