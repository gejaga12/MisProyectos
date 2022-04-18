package com.empresa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoEmpleado {

	public static void main(String[] args) {
		// creamos un objeto de tipo empleado
		JefeEmpleado e1 = new JefeEmpleado();
		// me creo una referencia a la abstraccion

		Empleados e2 = new JefeEmpleado();
		Empleados e3 = new SecretarioEmpleado();

		// uso de los objetos creados
		System.out.println("e1:" + e1.getTareas());
		System.out.println("e2:" + e2.getTareas());
		System.out.println("e3:" + e3.getTareas());

		// ahora hacemos lo mismo pero con el contenedor de spring

		// paso 1 cargar el xml
		// primero creamos un contexto y le ponemos el nombre del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// paso 2 pedirle el beans al archivo xml , pasandole el alias o id y en segundo
		// lugar le paso el nombre de la interface
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);

		// paso 3 utilizamos el objeto
		System.out.println("utilizamos el bean " + Juan.getTareas());

		// DEmo de inyeccion de dependencias : la ventaja de esto es que ahora podemos
		// reutilizarlo en otra clases como jefeEmpleado
		System.out.println("Utilizamos la inyeccion de dependencias : " + Juan.getInformes());

		// paso 4 cerramos el contexto y liberamos los recursos
		contexto.close();

	}

}