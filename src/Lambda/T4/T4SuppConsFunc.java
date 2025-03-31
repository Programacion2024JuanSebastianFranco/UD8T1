package Lambda.T4;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

/**
 * Clase que demuestra el uso de Predicate, Supplier, Function y BiPredicate.
 */
public class T4SuppConsFunc {
    public static void main(String[] args) {
        // Predicate: Verifica si un número es mayor que 100
        Predicate<Integer> mayor100 = i -> i > 100;
        System.out.println(mayor100.test(101));
        System.out.println(mayor100.test(10));

        // Predicate: Verifica si un número está entre 100 y 300
        Predicate<Integer> entre = i -> i >= 100 && i <= 300;
        System.out.println(entre.test(101));

        // Predicate: Verifica si un número es mayor a 100 o menor a 50
        Predicate<Integer> es = i -> i > 100 || i < 50;
        System.out.println(es.test(51));

        // Predicate: Verifica si un número no es 100
        Predicate<Integer> no = i -> i != 100;
        System.out.println(no.test(100));

        // BiPredicate: Compara dos cadenas
        BiPredicate<String, String> str = String::equals;
        System.out.println(str.test("hola", "hola"));

        // Lista de números y filtro con Predicate
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 26, 9, 30);
        Predicate<Integer> numeroos = i -> i >= 25 && i <= 30;
        numeros.stream().filter(numeroos).forEach(System.out::println);

        // Lista de palabras
        List<String> palabras = Arrays.asList("hola", "adios", "perro", "gato", "pato", "paloma");

        // Predicate: Longitud de 5 o empieza con 'a'
        Predicate<String> comparar = i -> i.length() == 5 || i.charAt(0) == 'a';
        palabras.stream().filter(comparar).forEach(System.out::println);

        // Predicate: No empieza con 'p'
        Predicate<String> noEmpiezaP = i -> i.charAt(0) != 'p';
        palabras.stream().filter(noEmpiezaP).forEach(System.out::println);

        // Supplier: Frase fija
        Supplier<String> frase = () -> "Me gusta Java";
        System.out.println(frase.get());

        // Lista de ciudades
        List<String> ciudades = Arrays.asList("Elche", "Alicante", "Elda", "Petrer", "Aspe");

        // Supplier: Ciudad aleatoria
        Random random = new Random();
        Supplier<Integer> aleatorio = () -> random.nextInt(ciudades.size());
        System.out.println("Me voy de viaje a " + ciudades.get(aleatorio.get()));

        // Supplier: Fecha actual
        Supplier<String> fecha = () -> String.valueOf(LocalDate.now());
        System.out.println("La fecha actual es: " + fecha.get());

        // Supplier: Día de la semana
        Supplier<String> diaSem = () -> String.valueOf(LocalDate.now().getDayOfWeek());
        System.out.println("Hoy es: " + diaSem.get());

        // Convertir cada ciudad a mayúsculas
        ciudades.forEach(i -> System.out.println(i.toUpperCase()));

        // Function: Longitud de una cadena
        Function<String, Integer> longi = String::length;
        System.out.println(longi.apply("Programación"));

        // Function: Cuadrado de un número
        Function<Integer, Integer> potencia = i -> i * i;
        System.out.println(potencia.apply(4));

        // Function: Mostrar resultado con prefijo
        Function<Double, String> mostrar = i -> "Resultado: " + i;
        System.out.println(mostrar.apply(4.2));

        // Muestra la lista de ciudades
        ciudades.forEach(System.out::println);

        // Function: Convierte una lista en un HashMap con la longitud de cada ciudad
        Function<String, Integer> funcion = String::length;
        HashMap<String, Integer> resultado = convertirListaEnMap(ciudades, funcion);
        resultado.forEach((s, i) -> System.out.println(s + ": " + i));

        // Function: Cuenta la cantidad de letras 'a' en cada ciudad
        Function<String, Integer> letraA = pal -> (int) pal.chars().filter(c -> c == 'a').count();
        HashMap<String, Integer> resultados = convertirListaEnMap(ciudades, letraA);
        resultados.forEach((s, i) -> System.out.println(s + ": " + i));
    }

    /**
     * Convierte una lista de cadenas en un HashMap aplicando una función a cada elemento.
     * @param lista Lista de cadenas.
     * @param funcion Función a aplicar.
     * @return HashMap con la cadena como clave y el resultado de la función como valor.
     */
    public static HashMap<String, Integer> convertirListaEnMap(List<String> lista, Function<String, Integer> funcion) {
        HashMap<String, Integer> map = new HashMap<>();
        lista.forEach(s -> map.put(s, funcion.apply(s)));
        return map;
    }
}
