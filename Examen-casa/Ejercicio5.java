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
        // Inicializamos el nodo mas cercano con la raiz
        return valorMasCercano(raiz, valor, raiz);
    }

    public Nodo valorMasCercano(Nodo nodo, int valor, Nodo masCercano) {
        // Caso base: Si el nodo es nulo, retornamos el nodo mas cercano
        if (nodo == null) {
            return masCercano;
        }
        // Se actualiza el nodo mas cercano si el valor del nodo actual es mas cercano
        if (Math.abs(nodo.getDato() - valor) < Math.abs(masCercano.getDato() - valor)) {
            masCercano = nodo;
        }

        // Si el valor es menor que el nodo actual, se busca en el subarbol izquierdo
        if (valor < nodo.getDato()) {
            return valorMasCercano(nodo.getIzq(), valor, masCercano);
        } 
        // Si el valor es mayor que el nodo actual, se busca en el subarbol derecho
        else if (valor > nodo.getDato()) {
            return valorMasCercano(nodo.getDer(), valor, masCercano);
        } 
        // Si el valor es igual al nodo actual, retornamos el nodo actual
        else {
            return nodo;
        }
    }

    public void print() {
        System.out.println("Ejercicio 5");
        print("", raiz, false);
        Nodo mascercano = valorMasCercano();
        System.out.println("El valor del nodo mas cercano a: " + valor + "\nEs: " + mascercano.getDato() + "\n");
    }

    public void print(String prefix, Nodo n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.getDer(), false);
            System.out.println(prefix + ("|-- ") + n.getDato());
            print(prefix + "     ", n.getIzq(), true);
        }
    }
}
