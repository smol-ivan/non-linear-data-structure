
import java.util.Stack;

public class Ejercicio1 {

    private Nodo raiz;

    public Ejercicio1(Nodo raiz) {

        this.raiz = raiz;
    }

    public int cuentaHojas() {

        return cuentaHojas(raiz);

    }

    private int cuentaHojas(Nodo nodo) {

        if (nodo == null)
            return 0;
        if (nodo.getIzq() == null && nodo.getDer() == null)
            return 1;
        return cuentaHojas(nodo.getIzq()) + cuentaHojas(nodo.getDer());

    }

    public int cuentaHojasIterativo() {

        int contadorHojas = 0;

        Stack<Nodo> pila = new Stack<Nodo>();

        pila.push(raiz);

        while (!pila.isEmpty()) {
            // Hago pop al último nodo

            Nodo nodo = pila.pop();

            // Si el nodo actual no tiene hijos (es una hoja)

            if (nodo.getIzq() == null && nodo.getDer() == null) {

                contadorHojas++;
            } else {
                // Si el nodo actual tiene al menos un hijo derecho
                if (nodo.getDer() != null) {
                    pila.push(nodo.getDer());
                }

                if (nodo.getIzq() != null) {
                    pila.push(nodo.getIzq());
                }
            }

        }

        return contadorHojas;
    }

    public void print() {
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