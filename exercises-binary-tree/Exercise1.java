public class Exercise1 {
    /*
     * Escriba una función que reciba como parámetro un árbol A y devuelva una copia
     * de él.
     */
    private Nodo raiz;
    // private Nodo copia;

    public Exercise1(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo copiaArbol() {
        return copiaArbol(raiz);
    }

    public static Nodo copiaArbol(Nodo raiz) {
        // Caso base con Nodo null, significa que no hay nada que copiar
        if (raiz == null) {
            return null;
        }
        Nodo nuevoNodo = new Nodo(raiz.getDato());
        // Se copian los subarboles
        nuevoNodo.setIzq(copiaArbol(raiz.getIzq()));
        nuevoNodo.setDer(copiaArbol(raiz.getDer()));

        return nuevoNodo;
    }

    public void print() {
        /*
         * Se imprime el arbol original y la copia
         */
        System.out.println("Original");
        print("", raiz, false);
        System.out.println("Copia");
        print("", copiaArbol(raiz), false);
    }

    public void print(String prefix, Nodo n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.getDer(), false);
            System.out.println(prefix + ("|-- ") + n.getDato());
            print(prefix + "     ", n.getIzq(), true);
        }
    }

}