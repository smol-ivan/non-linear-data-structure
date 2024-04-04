import java.util.Stack;

public class Ejercicio2 {

    private Nodo raiz1;
    private Nodo raiz2;

    public Ejercicio2(Nodo raiz1, Nodo raiz2) {

        this.raiz1 = raiz1;
        this.raiz2 = raiz2;
    }

    public boolean esEspejo() {

        return esEspejo(raiz1, raiz2);

    }

    public boolean esEspejoIterativo() {

        // Esta vacío
        if (raiz1 == null && raiz2 == null) {
            return true;
        }

        // Solo uno de los dos esta vacío
        if (raiz1 == null || raiz2 == null) {

            return false;
        }

        Stack<Nodo> pila1 = new Stack<Nodo>();
        Stack<Nodo> pila2 = new Stack<Nodo>();

        pila1.push(raiz1);
        pila2.push(raiz2);

        while (!pila1.isEmpty() && !pila2.isEmpty()) {

            Nodo nodo1 = pila1.pop();
            Nodo nodo2 = pila2.pop();

            if (nodo1.getDato() != nodo2.getDato()) {
                return false;
            }

            // Se apilan los nodos en orden inverso para ver si son esEspejo
            if (nodo1.getDer() != null) {
                pila1.push(nodo1.getDer());
            }

            if (nodo2.getIzq() != null) {
                pila2.push(nodo2.getIzq());
            }

            if (nodo1.getIzq() != null) {
                pila1.push(nodo1.getIzq());
            }

            if (nodo2.getDer() != null) {
                pila2.push(nodo2.getDer());
            }

        }
        return pila1.isEmpty() && pila2.isEmpty();
    }

    private boolean esEspejo(Nodo nodo1, Nodo nodo2) {

        // Esta vacío
        if (nodo1 == null && nodo2 == null) {
            return true;
        }

        // Solo uno de los dos esta vacío
        if (nodo1 == null || nodo2 == null) {

            return false;
        }

        return nodo1.getDato() == nodo2.getDato() && esEspejo(nodo1.getIzq(), nodo2.getDer())
                && esEspejo(nodo1.getDer(), nodo2.getIzq());

    }

    public void print() {
        System.out.println("---------Arbol 1 ---------------");
        print("", raiz1, false);
        System.out.println("---------Arbol 2 ---------------");
        print("", raiz2, false);

    }

    public void print(String prefix, Nodo n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.getDer(), false);
            System.out.println(prefix + ("|-- ") + n.getDato());
            print(prefix + "     ", n.getIzq(), true);
        }
    }

}