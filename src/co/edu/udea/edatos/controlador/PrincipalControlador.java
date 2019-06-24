package co.edu.udea.edatos.controlador;

import co.edu.udea.edatos.modelo.Empleado;
import co.edu.udea.edatos.negocio.EmpleadoBsn;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrincipalControlador {
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtCargo;
    private EmpleadoBsn empleadoBsn = new EmpleadoBsn();

    public void guardar_click(){
        String id=txtId.getText();
        String nombre=txtNombre.getText();
        String apellidos=txtApellidos.getText();
        String cargo =txtCargo.getText();

        Empleado empleadoAlmacenar=new Empleado(id,nombre,apellidos,cargo);
        empleadoBsn.guardarEmpleado(empleadoAlmacenar);

    }

}
