package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que representa una persona con sus atributos básicos: nombre, DNI, teléfono y dirección.
 */
public class Persona {
    String nombre;     // Atributo para el nombre de la persona
    String DNI;        // Atributo para el DNI de la persona
    String telefono;   // Atributo para el número de teléfono de la persona
    String direccion;  // Atributo para la dirección de la persona

    /**
     * Constructor de la clase Persona.
     * @param nombre Nombre de la persona.
     * @param DNI DNI de la persona.
     * @param telefono Teléfono de la persona.
     * @param direccion Dirección de la persona.
     */
    public Persona(String nombre, String DNI, String telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Método estático que extrae una lista de personas de un texto usando expresiones regulares.
     * @param texto Texto que contiene los datos de las personas.
     * @return Lista de objetos Persona extraídos del texto.
     */
    public static List<Persona> extLi(String texto){
        // Expresión regular para extraer los datos de cada persona
        String regex= "Nombre:(.*), DNI: (.*), Teléfono: (\\d*), Dirección: (.*)";
        ArrayList<Persona> lista = new ArrayList<>();  // Lista para almacenar las personas extraídas
        Pattern pattern = Pattern.compile(regex);     // Compila el patrón de la expresión regular
        Matcher matcher = pattern.matcher(texto);     // Crea el matcher que buscará coincidencias en el texto

        // Itera sobre las coincidencias encontradas en el texto
        while (matcher.find()) {
            // Extrae los grupos de la coincidencia
            String nombre =matcher.group(1);  // Nombre de la persona
            String DNI = matcher.group(2);    // DNI de la persona
            String telefono = matcher.group(3); // Teléfono de la persona
            String direccion = matcher.group(4); // Dirección de la persona
            // Añade la persona extraída a la lista
            lista.add(new Persona(nombre, DNI, telefono, direccion));
        }
        // Retorna la lista de personas extraídas
        return lista;
    }

    /**
     * Método para representar a la persona como una cadena.
     * @return Cadena que representa a la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    /**
     * Método principal para ejecutar el ejemplo.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Texto de ejemplo con varias personas
        String contactos = "Nombre: Juan, DNI: 12345678A, Teléfono: 123456789, Dirección: Calle 123\n" +
                "Nombre: María, DNI: 87654321B, Teléfono: 987654321, Dirección: Avenida XYZ\n" +
                "Nombre: Carlos, DNI: 98765432C, Teléfono: 987654321, Dirección: Calle 456";

        // Llama al método extLi para extraer las personas del texto
        List<Persona> lista = extLi(contactos);

        // Imprime las personas extraídas
        lista.forEach(System.out::println);
    }
}
