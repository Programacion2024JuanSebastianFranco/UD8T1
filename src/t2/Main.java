package t2;

public class Main {
    public static void main(String[] args) {
        // Conjunto de cadenas
        Conjunto<String> conjuntoString = new Conjunto<>();
        conjuntoString.insert("Hola");
        conjuntoString.insert("Mundo");
        System.out.println("Posición de 'Hola': " + conjuntoString.find("Hola")); // Debería devolver 0
        System.out.println("Eliminando 'Mundo': " + conjuntoString.delete("Mundo")); // Debería devolver true
        System.out.println("Posición de 'Mundo': " + conjuntoString.find("Mundo")); // Debería devolver -1

        // Conjunto de enteros
        Conjunto<Integer> conjuntoInteger = new Conjunto<>();
        conjuntoInteger.insert(10);
        conjuntoInteger.insert(20);
        System.out.println("Posición de 10: " + conjuntoInteger.find(10)); // Debería devolver 0
        System.out.println("Eliminando 20: " + conjuntoInteger.delete(20)); // Debería devolver true
        System.out.println("Posición de 20: " + conjuntoInteger.find(20)); // Debería devolver -1

        // Intentando insertar una cadena en un conjunto de enteros (esto no se puede hacer)
        // Conjunto<Integer> conjuntoError = new Conjunto<>();
        // conjuntoError.insert("Cadena"); // Esto causaría un error de compilación porque los tipos son incompatibles.
    }
}
