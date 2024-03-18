import java.util.ArrayList;

/**
 * Esta clase gestiona una lista de empleados y proporciona métodos para
 * aumentar los salarios, mostrar información sobre los empleados y dar de alta
 * nuevos empleados.
 */
public class Empleados {

    // Lista de empleados
    static private ArrayList<Empleado> lista = new ArrayList<>();

    /**
     * Constructor vacío de la clase Empleados.
     */
    public Empleados() {
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * 
     * @param porcentaje El porcentaje de aumento del salario.
     */
    static public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra la información de todos los empleados en la lista.
     */
    static public void mostrar() {
        System.out.println(Textos.TITULO_MOSTRAR_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Da de alta un nuevo empleado con el nombre, cargo y salario dados.
     * 
     * @param nombre  El nombre del nuevo empleado.
     * @param cargo   El cargo del nuevo empleado.
     * @param salario El salario del nuevo empleado.
     */
    static public void darAltaEmpleado(String nombre, String cargo, int salario) {
        lista.add(new Empleado(nombre, cargo, salario));
    }
}