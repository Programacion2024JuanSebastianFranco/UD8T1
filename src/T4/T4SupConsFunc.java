package T4;

import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class T4SupConsFunc {
    public static void main(String[] args) {
        IntPredicate ejer1 = n -> n > 100;
        System.out.println(ejer1.test(100));

        IntPredicate ejer2 = n -> n > 100 && n < 300;
        System.out.println(ejer2.test(200));

        IntPredicate ejer3 = n -> n > 100 || n < 50;
        System.out.println(ejer3.test(200));

        IntPredicate ejer4 = n -> n != 100;
        System.out.println(ejer4.test(200));















    }
}
