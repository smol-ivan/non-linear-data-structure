public class Main {
    public static void main(String[] args) {

        // Arbol binario
        Nodo raiz = new Nodo(8);
        Nodo nodo1 = new Nodo(2);
        Nodo nodo2 = new Nodo(9);
        Nodo nodo3 = new Nodo(7);
        Nodo nodo4 = new Nodo(10);
        Nodo nodo5 = new Nodo(5);
        Nodo nodo6 = new Nodo(6);


        raiz.setIzq(nodo1);
        raiz.setDer(nodo2);
        nodo2.setIzq(nodo3);
        nodo2.setDer(nodo4);
        nodo1.setIzq(nodo5);
        nodo5.setDer(nodo6);

        // Ejercicio 5
        // Ejercicio5 ejercicio5 = new Ejercicio5(raiz, 10);
        // ejercicio5.print();

        // // Ejercicio Par
        EjercicioPar ejercicioPar = new EjercicioPar(raiz, 2);
        ejercicioPar.print();
        
    }
}
