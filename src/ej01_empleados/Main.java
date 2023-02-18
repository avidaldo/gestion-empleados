package ej01_empleados;

 public class Main {

    public static void main(String[] args) {

        Empresa.addCliente("Pepe", 23);
        Empresa.addCliente("María", 40);
        Empresa.addCliente("Antonia", 56);

        System.out.println(Empresa.listaClientes);


        Empresa.addEmpleado("Manuel", 46, "28000");
        Empresa.addEmpleado("Andrea", 44, "30000.11");
        Empresa.addEmpleado("Juan", 34, "29000.11");

        Empresa.addDirectivo("Alejandro", 36, "100000", Directivo.Categoria.DIRECTOR);


        Directivo directivoBuscado = (Directivo) Empresa.listaEmpleados.get(3);  // TODO: falta controlar error de casteo
        directivoBuscado.addSubordinado(Empresa.listaEmpleados.get(0)); // Manuel pasa a subordinado de Alejandro


        System.out.println(Empresa.listaEmpleados);

        // TODO: Testeo con eliminaciones


    }
}
