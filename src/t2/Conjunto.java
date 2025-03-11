package t2;

import java.util.Arrays;

public class Conjunto<T> {

    private static final int TAM = 10;
    private T[] array = (T[]) new Object[TAM];

    public Conjunto() {
        Arrays.fill(array, null);
    }

    public boolean insert(T element) {
        boolean inserted = false;
        int i = 0;
        while (i < TAM && !inserted) {
            if (array[i] == null) {
                array[i] = element;
                inserted = true;
            }
            i++;
        }
        return inserted;
    }

    public boolean delete(T element) {
        boolean deleted = false;
        int i = 0;
        while (i < TAM && !deleted) {
            if (element.equals(array[i])) {
                array[i] = null;
                deleted = true;
            }
            i++;
        }
        return deleted;
    }

    public T get(int pos) {
        if (pos >= 0 && pos < TAM) {
            return array[pos];
        }
        return null;
    }

    public int find(T element) {
        int i = 0;
        int pos = -1;
        while (i < TAM && pos == -1) {
            if (element.equals(array[i])) {
                pos = i;
            }
            i++;
        }
        return pos;
    }
}
