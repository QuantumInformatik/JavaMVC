package co.edu.udea.edatos.dao;

import co.edu.udea.edatos.modelo.Empleado;
import java.util.List;

public interface EmpleadoDAO {
    void guardarEmpleado(Empleado empleado);
    Empleado consultarEmpleadoPorIdentificacion(String id);
    List<Empleado> conusltarEmpleados();




}
