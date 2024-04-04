public class EjercicioPar {
    /*
     * 4.- Verificar si dos árboles binarios son isomórficos.- Recuerda que un árbol
     * es equivalisomorfo ente si tienen la misma estructura y pero no
     * necesariamente los mismos datos.
     */
    private Nodo raizA;
    private Nodo raizB;

    public EjercicioPar(Nodo raizA, Nodo raizB) {
        this.raizA = raizA;
        this.raizB = raizB;
    }

    public boolean isomorficos() {
        return isomorficos(raizA, raizB);
    }

    public boolean isomorficos(Nodo raizA, Nodo raizB) {
        // Si ambos nodos son nulos se sigue teniendo isomorfia
        if (raizA == null && raizB == null) {
            return true;
        }
        // Ya no hay ismorfia si al menos uno tiene hijos y el otro no
        if (raizA == null || raizB == null) {
            return false;
        }
        // Llamada recursiva para subarboles derecho e izquierdo
        return isomorficos(raizA.getIzq(), raizB.getIzq()) && isomorficos(raizA.getDer(), raizB.getDer());
    }

    public void print() {
        System.out.println("Son isomorficos?: " + isomorficos());
        print("", raizA, false);
        System.out.println("\n");
        print("", raizB, false);
    }

    public void print(String prefix, Nodo n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.getDer(), false);
            System.out.println(prefix + ("|-- ") + n.getDato());
            print(prefix + "     ", n.getIzq(), true);
        }
    }
}
