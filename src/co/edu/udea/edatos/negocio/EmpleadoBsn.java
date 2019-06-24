package co.edu.udea.edatos.negocio;

import co.edu.udea.edatos.dao.EmpleadoDAO;
import co.edu.udea.edatos.dao.impl.EmpleadoDAOList;
import co.edu.udea.edatos.modelo.Empleado;

public class EmpleadoBsn {
    private EmpleadoDAO empleadoDAO;
    public EmpleadoBsn(){

        empleadoDAO=new EmpleadoDAOList();
    }


    public void guardarEmpleado(Empleado empleado){
        //TODO validar reglas de negocio
        //TODO logica de cass de uso
        System.out.println("Paso por aquì.");
        this.empleadoDAO.guardarEmpleado(empleado);
    }
}
