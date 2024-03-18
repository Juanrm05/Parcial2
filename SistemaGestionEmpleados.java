import java.util.Scanner;

/**
 * Esta clase representa el sistema de gestión de empleados.
 * Permite dar de alta empleados, aumentar salarios y mostrar información sobre
 * los empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * El método principal que ejecuta el sistema de gestión de empleados.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             programa).
     */
    public static void main(String[] args) {
        // Dar de alta algunos empleados
        Empleados.darAltaEmpleado("Juan", "Desarrollador", 50000);
        Empleados.darAltaEmpleado("María", "Diseñadora", 45000);
        Empleados.darAltaEmpleado("Pedro", "Gerente", 60000);

        // Leer el porcentaje de aumento del salario del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.TEXTO_GET_PORCENTAJE_AUMENTO);
        double porcentaje = scanner.nextDouble();

        // Aumentar el salario de todos los empleados en función del porcentaje dado
        Empleados.aumentarSalario(porcentaje);

        // Mostrar la información actualizada de todos los empleados
        Empleados.mostrar();

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}