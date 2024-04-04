// import java.util.Stack;

public class Exercise2 {
    /*
     * Implementar un método recursivo que cuente el número de nodos en un árbol
     * binario.
     */
    private Nodo raiz;

    public Exercise2(Nodo raiz) {
        this.raiz = raiz;
    }

    public int cuentaNodos() {
        return cuentaNodos(raiz);
    }

    public int cuentaNodos(Nodo raiz) {
        if (raiz == null) {
            return 0;
        }
        return 1 + cuentaNodos(raiz.getIzq()) + cuentaNodos(raiz.getDer());

    }

    public void print() {
        /*
         * Se imprime el numero de nodos en el arbol
         */
        // System.out.println("Original");
        // print("", raiz, false);
    }

    public void print(String prefix, Nodo n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.getDer(), false);
            System.out.println(prefix + ("|-- ") + n.getDato());
            print(prefix + "     ", n.getIzq(), true);
        }
    }

    // public int cuentaNodosIterativo() {
    // if (raiz == null) {
    // return 0;
    // }

    // Stack<Nodo> stack = new Stack<>();
    // stack.push(raiz);

    // int count = 0;
    // while (!stack.isEmpty()) {
    // Nodo node = stack.pop();
    // if (node != null) {
    // count++;
    // stack.push(node.getIzq());
    // stack.push(node.getDer());
    // }
    // }
    // return count;
    // }

    // public int altura(Nodo raiz) {
    // if (raiz == null) {
    // return -1;
    // }
    // int alturaIzq = altura(raiz.getIzq());
    // int alturaDer = altura(raiz.getDer());
    // return Math.max(alturaIzq, alturaDer) + 1;
    // }

    // public boolean sonIguales(Nodo raiz1, Nodo raiz2) {
    // if (raiz1 == null && raiz2 == null) {
    // return true;
    // }

    // if (raiz1 == null || raiz2 == null) {
    // return false;
    // }

    // return raiz1.value == raiz2.value
    // && sonIguales(raiz1.getIzq(), raiz2.getIzq())
    // && sonIguales(raiz1.getDer(), raiz2.getDer());
    // }

    // public int alturaIterativa(Nodo raiz) {
    // if (raiz == null) {
    // return -1;
    // }

    // Stack<Nodo> nodos = new Stack<>();
    // Stack<Integer> alturas = new Stack<>();
    // nodos.push(raiz);
    // alturas.push(0);

    // int alturaMax = 0;
    // while (!nodos.isEmpty()) {
    // Nodo nodo = nodos.pop();
    // int altura = alturas.pop();
    // alturaMax = Math.max(alturaMax, altura);

    // if (nodo.getIzq() != null) {
    // nodos.push(nodo.getIzq());
    // alturas.push(altura + 1);
    // }

    // if (nodo.getDer() != null) {
    // nodos.push(nodo.getDer());
    // alturas.push(altura + 1);
    // }
    // }

    // return alturaMax;
    // }
    // public int valorMaximo(Nodo raiz) {
    // if (raiz == null) {
    // return Integer.MIN_VALUE;
    // }
    // int maxIzq = valorMaximo(raiz.getIzq());
    // int maxDer = valorMaximo(raiz.getDer());
    // return Math.max(raiz.value, Math.max(maxIzq, maxDer));
    // }

    // public int valorMinimo(Nodo raiz) {
    // if (raiz == null) {
    // return Integer.MAX_VALUE;
    // }
    // int minIzq = valorMinimo(raiz.getIzq());
    // int minDer = valorMinimo(raiz.getDer());
    // return Math.min(raiz.value, Math.min(minIzq, minDer));
    // }
    // public int valorMasCercano(Nodo raiz, int valor) {
    // if (raiz == null) {
    // return Integer.MAX_VALUE;
    // }
    // if (raiz.value == valor) {
    // return raiz.value;
    // }
    // int masCercanoIzq = valorMasCercano(raiz.getIzq(), valor);
    // int masCercanoDer = valorMasCercano(raiz.getDer(), valor);

    // int diffIzq = Math.abs(masCercanoIzq - valor);
    // int diffDer = Math.abs(masCercanoDer - valor);
    // int diffRaiz = Math.abs(raiz.value - valor);

    // if (diffIzq <= diffDer && diffIzq <= diffRaiz) {
    // return masCercanoIzq;
    // } else if (diffDer <= diffIzq && diffDer <= diffRaiz) {
    // return masCercanoDer;
    // } else {
    // return raiz.value;
    // }
    // }
    // public boolean esBST(Nodo nodo, int min, int max) {
    // if (nodo == null) {
    // return true;
    // }
    // if (nodo.value < min || nodo.value > max) {
    // return false;
    // }
    // return esBST(nodo.getIzq(), min, nodo.value - 1) && esBST(nodo.getDer(),
    // nodo.value + 1, max);
    // }

    // public boolean esBST(Nodo raiz) {
    // return esBST(raiz, Integer.MIN_VALUE, Integer.MAX_VALUE);
    // }
    /*
     * Para verificar si un árbol binario es un árbol de búsqueda binaria (BST),
     * puedes usar un enfoque recursivo. Aquí está el plan paso a paso:
     * Si el nodo actual es null, retorna true porque un árbol vacío es un BST.
     * Si el valor del nodo actual es menor que el valor máximo permitido y mayor
     * que el valor mínimo permitido, verifica los subárboles izquierdo y derecho
     * con los nuevos valores máximo y mínimo permitidos.
     * Si el valor del nodo actual no está dentro del rango permitido, retorna
     * false.
     * El valor máximo permitido para el subárbol izquierdo es el valor del nodo
     * actual y el valor mínimo permitido es Integer.MIN_VALUE.
     * El valor mínimo permitido para el subárbol derecho es el valor del nodo
     * actual y el valor máximo permitido es Integer.MAX_VALUE
     */
    // class NodoLista {
    // int value;
    // NodoLista next;

    // NodoLista(int value) {
    // this.value = value;
    // }
    // }

    // public NodoLista convertirALista(Nodo nodo) {
    // if (nodo == null) {
    // return null;
    // }

    // NodoLista nodoLista = new NodoLista(nodo.value);
    // nodoLista.next = convertirALista(nodo.getIzq());
    // NodoLista current = nodoLista;
    // while (current.next != null) {
    // current = current.next;
    // }
    // current.next = convertirALista(nodo.getDer());

    // return nodoLista;
    // }

    // Si el
    // nodo actual es null,retorna null.
    // Crea un
    // nuevo nodo
    // de lista
    // enlazada con
    // el valor
    // del nodo
    // actual.Haz una
    // llamada recursiva
    // al subárbol
    // izquierdo y
    // conecta el
    // resultado a
    // la lista
    // enlazada.Haz una
    // llamada recursiva
    // al subárbol
    // derecho y
    // conecta el
    // resultado a
    // la lista
    // enlazada.Retorna el
    // nodo de
    // la lista enlazada.
    // public int contarHojas(Nodo nodo) {
    //     if (nodo == null) {
    //         return 0;
    //     }
    //     if (nodo.getIzq() == null && nodo.getDer() == null) {
    //         return 1;
    //     }
    //     return contarHojas(nodo.getIzq()) + contarHojas(nodo.getDer());
    // }
    // import java.util.ArrayList;
    // import java.util.List;
    
    // class Nodo {
    //     List<Integer> values;
    //     Nodo izq;
    //     Nodo der;
    
    //     Nodo(int value) {
    //         values = new ArrayList<>();
    //         values.add(value);
    //     }
    // }
    
    // class BST {
    //     Nodo raiz;
    
    //     void insertar(int value) {
    //         raiz = insertar(raiz, value);
    //     }
    
    //     Nodo insertar(Nodo nodo, int value) {
    //         if (nodo == null) {
    //             return new Nodo(value);
    //         }
    //         if (value == nodo.values.get(0)) {
    //             nodo.values.add(value);
    //         } else if (value < nodo.values.get(0)) {
    //             nodo.izq = insertar(nodo.izq, value);
    //         } else {
    //             nodo.der = insertar(nodo.der, value);
    //         }
    //         return nodo;
    //     }
    
    //     Nodo buscar(int value) {
    //         return buscar(raiz, value);
    //     }
    
    //     Nodo buscar(Nodo nodo, int value) {
    //         if (nodo == null || nodo.values.get(0) == value) {
    //             return nodo;
    //         }
    //         if (value < nodo.values.get(0)) {
    //             return buscar(nodo.izq, value);
    //         } else {
    //             return buscar(nodo.der, value);
    //         }
    //     }
    // }
//     import java.util.ArrayList;
// import java.util.List;

// class Nodo {
//     List<Integer> values;
//     Nodo izq;
//     Nodo der;

//     Nodo(int value) {
//         values = new ArrayList<>();
//         values.add(value);
//     }
// }

// class BST {
//     Nodo raiz;

//     void insertar(int value) {
//         raiz = insertar(raiz, value);
//     }

//     Nodo insertar(Nodo nodo, int value) {
//         if (nodo == null) {
//             return new Nodo(value);
//         }
//         if (value == nodo.values.get(0)) {
//             nodo.values.add(value);
//         } else if (value < nodo.values.get(0)) {
//             nodo.izq = insertar(nodo.izq, value);
//         } else {
//             nodo.der = insertar(nodo.der, value);
//         }
//         return nodo;
//     }

//     Nodo buscar(int value) {
//         return buscar(raiz, value);
//     }

//     Nodo buscar(Nodo nodo, int value) {
//         if (nodo == null || nodo.values.get(0) == value) {
//             return nodo;
//         }
//         if (value < nodo.values.get(0)) {
//             return buscar(nodo.izq, value);
//         } else {
//             return buscar(nodo.der, value);
//         }
//     }
// }
// class BST {
//     Nodo raiz;

//     void insertar(int value) {
//         raiz = insertar(raiz, value);
//     }

//     Nodo insertar(Nodo nodo, int value) {
//         if (nodo == null) {
//             return new Nodo(value);
//         }
//         if (value == nodo.values.get(0)) {
//             nodo.values.add(value);
//         } else if (value < nodo.values.get(0)) {
//             nodo.izq = insertar(nodo.izq, value);
//         } else {
//             nodo.der = insertar(nodo.der, value);
//         }
//         return nodo;
//     }

//     void eliminar(int value) {
//         raiz = eliminar(raiz, value);
//     }

//     Nodo eliminar(Nodo nodo, int value) {
//         // Implementar la lógica de eliminación aquí
//         // Nota: La eliminación en un BST puede ser compleja dependiendo de los casos que quieras manejar
//         // (por ejemplo, eliminar un nodo con dos hijos)
//         return nodo;
//     }

//     Nodo buscar(int value) {
//         return buscar(raiz, value);
//     }

//     Nodo buscar(Nodo nodo, int value) {
//         if (nodo == null || nodo.values.get(0) == value) {
//             return nodo;
//         }
//         if (value < nodo.values.get(0)) {
//             return buscar(nodo.izq, value);
//         } else {
//             return buscar(nodo.der, value);
//         }
//     }
// }
}