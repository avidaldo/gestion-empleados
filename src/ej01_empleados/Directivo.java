package ej01_empleados;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado {

    public enum Categoria {DIRECTOR, SUBDIRECTOR, JEFE_AREA}

    private final Categoria categoria;
    private final List<Empleado> listaSubordinados = new ArrayList<>();

    public Categoria getCategoria() {
        return categoria;
    }

    public Directivo(String nombre, int edad, BigDecimal sueldo, Categoria categoria) {
        super(nombre, edad, sueldo);
        this.categoria = categoria;
    }

    public void addSubordinado(Empleado subordinado) {
        listaSubordinados.add(subordinado);
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                ", listaSubordinados=" + listaSubordinados +
                '}';
    }

}
