public class PruebaFuncionHash {

    public static void main(String[] args) {
        // Generar un conjunto de cadenas de entrada
        List<String> cadenas = generarCadenas();

        // Calcular la distribución de valores hash
        Map<Integer, Integer> distribucionHash = new HashMap<>();
        for (String cadena : cadenas) {
            int valorHash = FuncionHash.generarHash(cadena);
            distribucionHash.put(valorHash, distribucionHash.getOrDefault(valorHash, 0) + 1);
        }

        // Analizar la distribución de valores hash
        System.out.println("Distribución de valores hash:");
        for (Map.Entry<Integer, Integer> entrada : distribucionHash.entrySet()) {
            System.out.println("Valor hash: " + entrada.getKey() + ", Frecuencia: " + entrada.getValue());
        }
    }

    private static List<String> generarCadenas() {
        // Implementar la lógica para generar un conjunto de cadenas de entrada
        // (por ejemplo, leer cadenas de un archivo o generar cadenas aleatorias)
    }
}
