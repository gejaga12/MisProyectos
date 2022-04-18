package com.empresa;

//implementamos la interfaz

public class DirectorEmpleado implements Empleados {

	// creacion de campo del tipo CreacionInformes (Interface) , para la inyeccion
	// de dependencias
	private CreacionInformes informeNuevo;

	// creacion de constructor para la inyeccion de dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestiono la nomina de empleados";
	}

	@Override
	public String getInformes() {
		// utilizamos el metodo getInforme de la interface
		return "informe creado por el director " + informeNuevo.getInforme();
	}

	//Metodos para demostracion de ciclo de vida de un beans 
	public void metodoInicial() {
		//aca va el codigo que queremos ejecutar antes que el bean este disponible 
        System.out.println("dentor del metodo init aca van las tareas a ejecutar antes que el bean este listo");
	}

	public void metodoFinal() {
		//aca va el codigo que queremos ejecutar despues de que el vean se "muera"
		 System.out.println("dentor del metodo init aca van las tareas a ejecutar despues de que el vean se muera");
	}

}