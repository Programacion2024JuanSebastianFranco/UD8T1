package t2;

public class Main {
    public static void main(String[] args) {

        Conjunto<String> conjuntoString = new Conjunto<>();
        conjuntoString.insert("Hola");
        conjuntoString.insert("Mundo");
        System.out.println("Posición de 'Hola': " + conjuntoString.find("Hola"));
        System.out.println("Eliminando 'Mundo': " + conjuntoString.delete("Mundo"));
        System.out.println("Posición de 'Mundo': " + conjuntoString.find("Mundo"));

        Conjunto<Integer> conjuntoInteger = new Conjunto<>();
        conjuntoInteger.insert(10);
        conjuntoInteger.insert(20);
        System.out.println("Posición de 10: " + conjuntoInteger.find(10));
        System.out.println("Eliminando 20: " + conjuntoInteger.delete(20));
        System.out.println("Posición de 20: " + conjuntoInteger.find(20));

    }
}
