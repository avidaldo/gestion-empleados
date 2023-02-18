package ej01_empleados;

import java.math.BigDecimal;

public class Empleado {
    private int id;
    private final String nombre;
    private int edad;
    private BigDecimal sueldo;

    public Empleado(String nombre, int edad, BigDecimal sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }
}
