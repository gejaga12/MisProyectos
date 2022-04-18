package com.empresa;

public class JefeEmpleado implements Empleados{

	@Override
	public String getTareas() {
		return "Soy el jefe , y encargado de todos , asi que o me obedecen o renuncian";
	}

	@Override
	public String getInformes() {
		return "Soy un jefe de empleado y este es mi informe mistico";
	}

}
