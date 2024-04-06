import java.util.Stack;

public class UnbalancedBinarySearchTree {
    /*
     * author:  Silvia Orduña Alarcón
     *          Ivan Javier Gordillo Solis
     *          Bruno Gabriel Oropeza Hernandez
     * 
     */
    public TreeNode root;

    public UnbalancedBinarySearchTree() {
        this.root = null;
    }

    // Implementar la inserción de un valor en el árbol
    public void insert(int val) {
        TreeNode nuevo, actual, anterior;
        nuevo = new TreeNode(val);
        actual = root;
        anterior = null;
        while (actual != null) {
            if (val == actual.getVal()) 
                return;
            anterior = actual;
            actual = actual.getVal() > val ? actual.getLeft() : actual.getRight();
        }
        if (anterior == null) 
            root = nuevo;
        else {
            if (anterior.getVal() > val) 
                anterior.setLeft(nuevo);
            else 
                anterior.setRight(nuevo);
        }

    }

    // Implementar la eliminación de un valor en el árbol
    public void delete(int val) {
        TreeNode actual, padre;
        actual = root;
        padre = null;
        Stack<TreeNode> pila = new Stack<>();
        
        // Buscar el nodo a eliminar
        while (actual != null && actual.getVal() != val) {
            padre = actual;
            pila.push(actual);
            if (val < actual.getVal()) 
                actual = actual.getLeft();
            else 
                actual = actual.getRight();
        }
        // No se encontro el nodo a eliminar 
        if (actual == null) 
            return;
        // Caso 1: El nodo a eliminar es una hoja o tiene un hijo
        if (actual.getLeft() == null || actual.getRight() == null) {
            TreeNode hijo = actual.getLeft() == null ? actual.getRight() : actual.getLeft();
            if (padre == null) {
                root = hijo;
            } else if (padre.getLeft() == actual) {
                padre.setLeft(hijo);
            } else {
                padre.setRight(hijo);
            }
        } else {
            // Caso 2: El nodo a eliminar tiene dos hijos
            TreeNode sucesorPadre = actual;
            TreeNode sucesor = actual.getRight();

            // Encontrar el predecesor (mayor valor en el subárbol izquierdo)
            while (sucesor.getLeft() != null) {
                pila.push(sucesor);
                sucesorPadre = sucesor;
                sucesor = sucesor.getLeft();
            }

            // Copiar el valor del predecesor al nodo a eliminar
            actual.setVal(sucesor.getVal());

            // Eliminar el predecesor
            if (sucesorPadre.getLeft() == actual) {
                sucesorPadre.setLeft(sucesor.getRight());
            } else {
                sucesorPadre.setRight(sucesor.getRight());
            }
        }
    }

    // Implementar la búsqueda de un valor en el árbol
    public boolean search(int val) {
        // return searchRecursivo(val, root);
        TreeNode actual = root;
        while (actual != null) {
            if (actual.getVal() == val) 
                return true;
            else 
                actual = actual.getVal() > val ? actual.getLeft() : actual.getRight();
        }
        return false;
    }

    // Método para imprimir el árbol en orden
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.getLeft());
            System.out.print(root.getVal() + " ");
            inorderTraversal(root.getRight());
        }
    }

    // Método para imprimir el árbol en orden
    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.getVal() + " ");
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
    }

    // Método para imprimir el árbol en orden
    public void posorderTraversal(TreeNode root) {
        if (root != null) {
            posorderTraversal(root.getLeft());
            posorderTraversal(root.getRight());
            System.out.print(root.getVal() + " ");
        }
    }

    public void print() {
        System.out.println("Árbol binario:");
        print("", root, false);
    }
    
    public void print(String prefix, TreeNode n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.getRight(), false);
            System.out.println(prefix + ("|-- ") + n.getVal());
            print(prefix + "     ", n.getLeft(), true);
        }
    }
}
