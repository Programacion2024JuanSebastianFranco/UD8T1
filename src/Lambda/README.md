## T3 Lambda

## 1.

    a. Sí, pero solo si la interfaz tiene un único método.
    
    b. Si está anotada con @FunctionalInterface, se puede usar una expresión lambda.
    
    c. No, porque List tiene varios métodos abstractos.

---

## 2.

    Sí, porque Callable es una @FunctionalInterface.

---

## 3.

    Sí, porque Comparator es una @FunctionalInterface.

---

## 4.
````java
 Runnable runnable = () -> {
        String texto = "Vamos a crear un array";
        String[] partes = texto.split(" ");
        for (String parte: partes) {
            System.out.println(parte);
        }
    };
````

---

## 5.
````java
    OperacionUnitariaEntera operacion = (x) -> x + x;
````
````java
    OperaciónBinariaDecimal operacion = (x) -> x * x;
````
````java
    Predicate<Integer> operacion = (x) -> x * 5 > 100;
````
````java
   OperacionBinariaEntera operacion = (x, y) -> x * y;
````
````java
    Saludable sal  = () -> System.out.println("hola mundo");
````

---

## 6.
````java
   public interface Predicate{
    boolean test(int x);
}
````
````java
public interface UnaryOperator{
int apply(int x);
}
````
````java
public interface Consumer{
void accept(int x);
}
````
````java
public interface BinaryOperator{
int apply(int x, int y);
}
````
````java
public interface Predicate{
    boolean test(int x);
}
````
---

## 7.
````java
   Function<String, String> caracteresPares = (texto) -> {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < texto.length(); i++) {
        if (i % 2 == 0) {
            sb.append(texto.charAt(i));
        }
    }
    return sb.toString();
};
````

---

## 8.
````java
   static Function<String, String> caracteresPares = (texto) -> { 
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < texto.length(); i++) {
        if (i % 2 == 0) {
            sb.append(texto.charAt(i));
        }
    }
    return sb.toString();
};

public static void main(String[] args) {
    System.out.println(caracteresPares.apply("1234567890"));
}
````
---

## 9.
````java
    static Function<String, String> caracteresPares = (texto) -> { //Lo que recibe (String), lo que devuelve (String)
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < texto.length(); i++) {
        if (i % 2 == 0) {
            sb.append(texto.charAt(i));
        }
    }
    return sb.toString();
};

public static String paresEjecuta(Function<String, String> funcion) { //Indicamos los parámetros que tiene la lambda
    return funcion.apply("1234567890");
}

public static void main(String[] args) {
    String resultado = paresEjecuta(caracteresPares);
    System.out.println(resultado);
}
````

---

## 10.
````java
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
    ciudades.sort((s1, s2) -> s1.compareTo(s2));
    ciudades.forEach(
            (ciudad)->{
                String letra = (ciudad.substring(0,1)).toUpperCase() + ciudad.substring(1,ciudad.length());
                System.out.println(letra);
            }
    );
}
````

---

## 18.
````java
       List<String> lista = Arrays.asList("hello", "world", "java", "lambda");
        lista.forEach(System.out::println);
        
````
````java
             lista.sort(String::compareTo);
````




