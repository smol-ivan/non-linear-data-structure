public class HeapSort {

    public static void ordenar(int[] datos) {
        MonticuloMaximo monticulo = new MonticuloMaximo(datos);

        while (!monticulo.estaVacio()) {
            int maximo = monticulo.eliminarMaximo();
            // datos[datos.length - monticulo.tamanio - 1] = maximo;
            datos[monticulo.tamanio()] = maximo;
        }
    }
}