import co.edu.udea.edatos.modelo.Empleado;
import co.edu.udea.edatos.negocio.EmpleadoBsn;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        EmpleadoBsn empleadoBsn = new EmpleadoBsn();
        Scanner scan = new Scanner(System.in);

        System.out.printf("Ingrese identificaciòn: ");
        String id=scan.next();

        System.out.printf("Ingrese nombres: ");
        String nombre=scan.next();

        System.out.printf("Ingrese apellidos: ");
        String apellidos=scan.next();

        System.out.printf("Ingrese cargo: ");
        String cargo=scan.next();

        Empleado empleado = new Empleado(id,nombre,apellidos,cargo);
        empleadoBsn.guardarEmpleado(empleado);

    }
}
