package com.empresa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCicloVidaBeans {

	public static void main(String[] args) {
		// paso 1 cargar el xml
		// primero creamos un contexto y le ponemos el nombre del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		// paso 2 pedirle el beans al archivo xml , pasandole el alias o id y en segundo
		// lugar le paso el nombre de la interface
		Empleados director = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);

		// paso 3 utilizamos el objeto
		System.out.println("utilizamos el bean para obetner un informe " + director.getInformes());

		// paso 4 cerramos el contexto y liberamos los recursos
		contexto.close();
	}


		
		
}


