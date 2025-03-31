package Generica;

public class Main {
    public static void main(String[] args) {
        Conjunto<String> s = new Conjunto<>();
        Conjunto<Integer> i = new Conjunto<>();

        System.out.println(s.inset("hola"));
        System.out.println(s.inset("adios"));
        System.out.println(i.inset(1));
        System.out.println(i.inset(2));

        System.out.println(s.find("hola"));
        System.out.println(s.find("adios"));
        System.out.println(i.find(1));
        System.out.println(i.find(5));

        System.out.println(s.delete("adios"));
        System.out.println(i.delete(8));

    }
}

//¿Puedes insertar una cadena en un conjunto de enteros? Explica lo que sucede cuando lo intentas
//No, no se puede. Si creamos un Conjunto<Integer>, solo aceptará Integer. Intentar insertar un String
//causará un error de compilación porque Java aplica tipado fuerte en los genéricos.