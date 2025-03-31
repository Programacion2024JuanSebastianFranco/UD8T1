package Generica;

/**
 * Clase genérica que representa un conjunto de elementos.
 * @param <T> Tipo de elementos almacenados en el conjunto.
 */
public class Conjunto<T> {
    private static final int TAM = 10; // Tamaño máximo del array
    private T[] array = (T[]) new Object[TAM]; // Array genérico de elementos

    /**
     * Inserta un elemento en el conjunto si hay espacio disponible.
     * @param element Elemento a insertar.
     * @return true si el elemento se insertó con éxito, false en caso contrario.
     */
    public boolean inset(T element) {
        boolean es = false;
        int pos = 0;

        while (!es && (pos < TAM)) {
            if (array[pos] == null) { // Encuentra un espacio vacío
                array[pos] = element;
                es = true;
            } else {
                pos++;
            }
        }
        return es;
    }

    /**
     * Elimina un elemento del conjunto si existe.
     * @param element Elemento a eliminar.
     * @return true si el elemento fue eliminado, false en caso contrario.
     */
    public boolean delete(T element) {
        boolean es = false;
        int pos = 0;

        while (!es && (pos < TAM)) {
            if (array[pos] != null && array[pos].equals(element)) { // Elemento encontrado
                array[pos] = null;
                es = true;

                int siguientePos = pos;
                while (siguientePos < TAM - 1) { // Desplaza los elementos a la izquierda
                    array[siguientePos] = array[siguientePos + 1];
                    siguientePos++;
                }
                array[siguientePos] = null; // Última posición a null
            } else {
                pos++;
            }
        }
        return es;
    }

    /**
     * Obtiene el elemento en una posición específica.
     * @param pos Posición del elemento.
     * @return El elemento en la posición indicada o null si está vacío.
     */
    public T get(int pos) {
        return array[pos]; // Devuelve el elemento directamente
    }

    /**
     * Busca un elemento en el conjunto y devuelve su posición.
     * @param element Elemento a buscar.
     * @return La posición del elemento o -1 si no se encuentra.
     */
    public int find(T element) {
        int es = -1;
        int cont = 0;
        boolean ess = false;

        while (!ess && cont < array.length) {
            if (array[cont] != null && array[cont].equals(element)) { // Elemento encontrado
                es = cont;
                ess = true;
            }
            cont++;
        }
        return es;
    }
}
