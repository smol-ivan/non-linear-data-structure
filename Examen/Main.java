public class Main {
    public static void main(String[] args) {

        // Arbol binario
        // Nodo raiz = new Nodo(8);
        // Nodo nodo1 = new Nodo(2);
        // Nodo nodo2 = new Nodo(9);
        // Nodo nodo3 = new Nodo(7);
        // Nodo nodo4 = new Nodo(10);

        // Arbol NO binario
        Nodo raiz = new Nodo(8);
        Nodo nodo1 = new Nodo(2);
        Nodo nodo2 = new Nodo(9);
        Nodo nodo3 = new Nodo(7);
        Nodo nodo4 = new Nodo(1);

        raiz.setIzq(nodo1);
        raiz.setDer(nodo2);
        nodo2.setIzq(nodo3);
        nodo2.setDer(nodo4);

        Nodo raizb = new Nodo(1);
        Nodo nodo1b = new Nodo(2);
        Nodo nodo2b = new Nodo(10);
        Nodo nodo3b = new Nodo(4);
        Nodo nodo4b = new Nodo(5);

        // // Isomorfo
        // raizb.setIzq(nodo1b);
        // raizb.setDer(nodo2b);
        // nodo2b.setIzq(nodo3b);
        // nodo2b.setDer(nodo4b);

        // No ismorfo
        raizb.setIzq(nodo1b);
        raizb.setDer(nodo2b);
        nodo2b.setIzq(nodo3b);

        // Ejercicio Par
        /*
         * Para probar el codigo de la segunda lista de ejercicios par[4]
         * hay que comentar y descomentar arriba el codigo de prueba
         */
        EjercicioPar ejPar = new EjercicioPar(raiz, raizb);
        ejPar.print();

        // Ejercicio 6
        /*
         * Ejercicio 6 de tarea
         */
        Ejercicio6 eje6 = new Ejercicio6(raiz);
        eje6.print();
    }
}
