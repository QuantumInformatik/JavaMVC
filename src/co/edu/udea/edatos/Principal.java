package co.edu.udea.edatos;

import co.edu.udea.edatos.modelo.Empleado;
import co.edu.udea.edatos.negocio.EmpleadoBsn;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);

        /*EmpleadoBsn empleadoBsn = new EmpleadoBsn();
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
        empleadoBsn.guardarEmpleado(empleado);*/

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("vista/principal.fxml"));
        primaryStage.setTitle("java mvc");
        primaryStage.setScene(new Scene(root,400,500));
        primaryStage.show();


    }
}
