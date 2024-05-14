import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorDeGrafos {

    public int[][] leerMatrizDeAdyacencia(String nombreArchivo) throws IOException {
        int[][] matrizDeAdyacencia = null;

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroVertices = 0; // Suponiendo que los vértices están numerados desde 0
            int numeroAristas = 0;
    
            // Leer la primera línea para obtener el número de vértices y aristas
            if ((linea = lector.readLine()) != null) {
                String[] partes = linea.trim().split(" ");
                if (partes.length != 2) {
                    throw new IllegalArgumentException("Formato de primera línea inválido en el archivo: " + linea);
                }
    
                numeroVertices = Integer.parseInt(partes[0]);
                numeroAristas = Integer.parseInt(partes[1]);
    
                matrizDeAdyacencia = new int[numeroVertices][numeroVertices];
            } else {
                throw new IOException("Archivo vacío o primera línea inválida");
            }
    
            // Leer líneas subsiguientes y llenar la matriz de adyacencia
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.trim().split(" ");
                if (partes.length != 3) {
                    throw new IllegalArgumentException("Formato de línea inválido en el archivo: " + linea);
                }
    
                int origen = Integer.parseInt(partes[0]); // No se ajusta el índice
                int destino = Integer.parseInt(partes[1]);
                int peso = (int) Double.parseDouble(partes[2]);
    
                matrizDeAdyacencia[origen][destino] = peso;
                matrizDeAdyacencia[destino][origen] = peso; // Añadir la arista en ambas direcciones para grafos no dirigidos
            }
        }
    
        return matrizDeAdyacencia;
    }
}
