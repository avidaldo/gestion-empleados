package ej01_empleados;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Empresa {
    public static final List<Cliente> listaClientes = new ArrayList<>();
    public static final List<Empleado> listaEmpleados = new ArrayList<>();

    public static void addCliente(String nombre, int edad) {
        listaClientes.add(new Cliente(nombre, edad));
    }

    public static void addEmpleado(String nombre, int edad, String sueldoString) {
        listaEmpleados.add(new Empleado(nombre, edad, new BigDecimal(sueldoString)));
    }

    public static void addDirectivo(String nombre, int edad, String sueldoString, Directivo.Categoria categoria) {
        listaEmpleados.add(new Directivo(nombre, edad, new BigDecimal(sueldoString), categoria));
    }


    // métodos remove análogos


}
