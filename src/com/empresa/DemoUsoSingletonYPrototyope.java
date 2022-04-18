package com.empresa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUsoSingletonYPrototyope {

	public static void main(String[] args) {

		// paso 1 cargar el xml
		// primero creamos un contexto y le ponemos el nombre del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// paso 2 pedirle el beans al archivo xml , pasandole el alias o id y en segundo
		// lugar le paso el nombre de la interface
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

//		paso 3
//		comprobamos que ambos objetos apuntan a la misma direccion de memoria 
		System.out.println(maria);
		System.out.println(pedro);

		if (maria == pedro) {
			System.out.println("Apuntan al mismo objeto y direccion de memoria ");
		} else {
			System.out.println("Apuntan a distintos objetos y direcciones de memoria ");
		}

		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		Empleados pepe = contexto.getBean("miEmpleado", Empleados.class);

//		paso 3
//		comprobamos que ambos objetos apuntan a la misma direccion de memoria 
		System.out.println(juan);
		System.out.println(pepe);

		if (juan == pepe) {
			System.out.println("Apuntan al mismo objeto y direccion de memoria ");
		} else {
			System.out.println("Apuntan a distintos objetos y direcciones de memoria ");
		}

		// paso 4 cerramos el contexto y liberamos los recursos
		contexto.close();

	}

}
