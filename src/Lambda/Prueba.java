package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * Clase de prueba para aplicar transformaciones a una lista de cadenas y ordenarlas.
 */
public class Prueba {
    /**
     * Aplica una transformación a cada elemento de la lista y luego la ordena.
     * @param lista Lista de cadenas.
     * @param transforma Función de transformación a aplicar a cada cadena.
     * @param comparator Comparador para ordenar la lista.
     */
    public static void ej11(List<String> lista, Function<String, String> transforma, Comparator<String> comparator) {
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, transforma.apply(lista.get(i))); // Aplica la transformación
        }
        lista.sort(comparator); // Ordena la lista
        lista.forEach(System.out::println); // Imprime los elementos
    }

    /**
     * Método principal para ejecutar diferentes transformaciones sobre una lista de ciudades.
     */
    public static void main(String[] args) {
        List<String> ciudades = Arrays.asList(
                "elche",
                "alicante",
                "elda",
                "petrer",
                "aspe",
                "crevillente",
                "alcoy",
                "ibi",
                "benidorm",
                "matola"
        );

        // Orden ascendente, primera letra en minúscula y el resto en mayúscula
        ej11(ciudades,
                s -> s.substring(0, 1).toLowerCase() + s.substring(1).toUpperCase(),
                Comparator.naturalOrder()
        );

        // Orden descendente, primera y última letra en mayúscula
        ej11(ciudades,
                s -> s.substring(0, 1).toUpperCase() + s.substring(1, s.length() - 1).toLowerCase()
                        + s.substring(s.length() - 1).toUpperCase(),
                Comparator.reverseOrder()
        );

        // Voltea el String ("hola" → "aloh") y ordena en ascendente
        ej11(ciudades,
                s -> new StringBuilder(s).reverse().toString(),
                Comparator.naturalOrder()
        );
    }
}
