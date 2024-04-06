public class Main {
    public static void main(String[] args) {
        // Crear un árbol binario de búsqueda no balanceado
        UnbalancedBinarySearchTree tree = new UnbalancedBinarySearchTree();

        // Insertar elementos en el árbol
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("Árbol binario: ");
        tree.print();
        
        // Imprimir el árbol en orden
        System.out.println("\n");
        System.out.println("Inorder traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\n");
        // Imporimir el árbol en preorden
        System.out.println("Preorder traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println("\n");
        // Imprimir el árbol en postorden
        System.out.println("Posorder traversal:");
        tree.posorderTraversal(tree.root);
        System.out.println("\n");

        // Buscar elementos en el árbol
        System.out.println("Busqueda de valores:");
        System.out.println("40 Encontrado?: " + tree.search(40));
        System.out.println("100 Encontrado?: " + tree.search(100) + "\n");

        System.out.println("Arbol antes de eliminar elementos:");
        tree.print();
        // Eliminar elementos del árbol
        System.out.println("Eliminando valores...:");
        // Eliminar nodo hoja
        System.out.println("Eliminando nodo hoja 20");
        tree.delete(20);
        tree.print();
        // Eliminar nodo con un hijo
        System.out.println("Eliminando nodo con un hijo 30");
        tree.delete(30);
        tree.print();
        // Eliminar nodo con dos hijos
        System.out.println("Eliminando nodo con dos hijos 50");
        tree.delete(50);
        tree.print();

    }
    
}
