package Streams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Clase que representa un empleado
public class Empleado implements Comparable<Empleado> {

    // Atributos de la clase Empleado
    private String nombre;
    private String apellido;
    private double sueldo;
    private LocalDate fechaEntrada;
    private Departamento departamento;

    // Enumeración para los departamentos de la empresa
    public enum Departamento {
        INFORMATICA,  // Departamento de informática
        CONTABILIDAD, // Departamento de contabilidad
        RRHH          // Departamento de recursos humanos
    }

    /**
     * Constructor de la clase Empleado.
     * @param nombre Nombre del empleado.
     * @param apellido Apellido del empleado.
     * @param sueldo Sueldo del empleado.
     * @param fechaEntrada Fecha en la que el empleado entró a la empresa.
     * @param departamento Departamento al que pertenece el empleado.
     */
    public Empleado(String nombre, String apellido, double sueldo, LocalDate fechaEntrada, Departamento departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.fechaEntrada = fechaEntrada;
        this.departamento = departamento;
    }

    // Métodos getter y setter para los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Método toString para representar la información del empleado.
     * @return Cadena con los datos del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldo=" + sueldo +
                ", fechaEntrada=" + fechaEntrada +
                ", departamento=" + departamento +
                '}';
    }

    /**
     * Comparación de empleados basada en el apellido.
     * @param o Empleado a comparar.
     * @return Resultado de la comparación del apellido.
     */
    @Override
    public int compareTo(Empleado o) {
        return this.apellido.compareTo(o.apellido);
    }

    public static void main(String[] args) {
        // Lista de empleados para realizar operaciones
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "García", 35000, LocalDate.of(2020, 3, 15), Departamento.INFORMATICA));
        empleados.add(new Empleado("María", "Martínez", 20000, LocalDate.of(2019, 8, 10), Departamento.CONTABILIDAD));
        empleados.add(new Empleado("Luis", "López", 28000, LocalDate.of(2022, 1, 20), Departamento.RRHH));
        empleados.add(new Empleado("Ana", "González", 37000, LocalDate.of(2023, 5, 5), Departamento.INFORMATICA));
        empleados.add(new Empleado("Carlos", "Rodríguez", 32000, LocalDate.of(2022, 12, 1), Departamento.CONTABILIDAD));

        // 2. Empleados con sueldo mayor a 30000
        empleados.stream()
                .filter(empleado -> empleado.sueldo > 30000)
                .forEach(empleado -> System.out.println(empleado.nombre));

        // 3. Empleados de Informática
        empleados.stream()
                .filter(empleado -> empleado.departamento == Departamento.INFORMATICA)
                .forEach(empleado -> System.out.println(empleado.nombre));

        // 4. Empleados de Contabilidad con sueldo mayor a 30000
        empleados.stream()
                .filter(empleado -> empleado.departamento == Departamento.CONTABILIDAD && empleado.sueldo > 30000)
                .peek(System.out::println)
                .collect(Collectors.toList());

        // 5. Lista de empleados del departamento de Informática
        List<String> empleadoss = empleados.stream()
                .filter(empleado -> empleado.getDepartamento() == Departamento.INFORMATICA)
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
        System.out.println(empleadoss);

        // 6. Lista de nombre + sueldo, ordenada por sueldo
        ArrayList<String> empleadosss = (ArrayList<String>) empleados.stream()
                .sorted(Comparator.comparingDouble(e -> e.getSueldo()))
                .map(e -> e.getNombre() + " " + e.getSueldo())
                .collect(Collectors.toList());
        System.out.println(empleadosss);

        // 7. Ordenar por departamento y apellido
        empleados.stream()
                .sorted(Comparator.comparing(Empleado::getDepartamento)
                        .thenComparing(Empleado::getApellido))
                .forEach(e -> System.out.println(e.getDepartamento() + " " + e.getApellido()));

        // 8. Empleados que entraron en 2022
        empleados.stream()
                .filter(empleado -> empleado.getFechaEntrada().getYear() == 2022)
                .forEach(empleado -> System.out.println(empleado.nombre));

        // 9. Imprimir fecha de entrada en formato local
        DateTimeFormatter fechas = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        empleados.stream()
                .forEach(empleado -> System.out.println(empleado.fechaEntrada.format(fechas)));

        // 10. Imprimir el empleado con sueldo máximo
        empleados.stream()
                .max(Comparator.comparing(Empleado::getSueldo))
                .ifPresent(System.out::println);

        // 11. Contar empleados de Informática
        long total = empleados.stream()
                .filter(empleado -> empleado.getDepartamento() == Departamento.INFORMATICA)
                .count();
        System.out.println("Total de informáticos: " + total);
    }
}