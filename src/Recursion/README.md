## 2.

    2. Imprime hasta el 5.
    
    Con 100 imprime 100 ya que no entra al bucle.

---

## 3.

    Infinito del 5 hacia abajo.

---

## 4.

    Ejemplo 3,2

    2+fun(3, 1) 
    2+fun(3, 0) 

---

## 5.

````java
public static int exponente(int x, int e) {
    if (e==0){
        return 1;
    }
    return n*exponente(x, e-1);
}
````

---

## 6.

````java
public static int exponente(int x, int e) {
    int r = 1;
    for( int i=0; i<e;i++) r*x{
        return r;
    }
}
````

---

## 7.

````java
public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int num) {
        if (num<=0){
            return  0;
        }
        else if (num==1){
            return  1;
        } else{
            return fibonacci(num-1) + fibonacci(num-2) ;
        }
    }
}
````



