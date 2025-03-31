package Regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que representa un punto en un sistema cartesiano con coordenadas x e y.
 */
public class Punto {

    // Coordenada x del punto
    int x;
    // Coordenada y del punto
    int y;

    /**
     * Constructor que inicializa las coordenadas del punto.
     * @param x Coordenada x
     * @param y Coordenada y
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Extrae los puntos de una cadena de texto que sigue el formato "{x,y}".
     * @param texto Cadena de texto que contiene los puntos.
     * @return Una lista de objetos Punto extraídos del texto.
     */
    public static ArrayList<Punto> extraeP(String texto){
        // Lista para almacenar los puntos extraídos
        ArrayList<Punto> lista = new ArrayList<>();

        // Expresión regular para encontrar los puntos en formato "{x,y}"
        String regex = "\\{(\\d+),(\\d+)}";
        // Compila el patrón de la expresión regular
        Pattern pattern = Pattern.compile(regex);
        // Crea un objeto Matcher para realizar la búsqueda en el texto
        Matcher matcher = pattern.matcher(texto);

        // Mientras se encuentren coincidencias
        while (matcher.find()) {
            // Convierte las coordenadas extraídas en enteros
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            // Añade un nuevo punto a la lista
            lista.add(new Punto(x, y));
        }

        // Retorna la lista de puntos
        return lista;
    }

    /**
     * Devuelve una representación en cadena del punto en formato "Punto{x=..., y=...}".
     * @return Cadena que representa el punto.
     */
    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * Método principal para probar la extracción de puntos de un texto.
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Cadena de texto con puntos en formato "{x,y}"
        String puntos = "{0,2}, {1,5}, {20,3}, {300,4}";

        // Extrae los puntos y los almacena en una lista
        ArrayList<Punto> lista = extraeP(puntos);

        // Imprime cada punto de la lista
        lista.forEach(System.out::println);
    }
}
