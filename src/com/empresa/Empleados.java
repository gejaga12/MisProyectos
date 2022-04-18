package com.empresa;

//interface es un conjunto de metodos abtractos osea metodos sin cuerpo y atributo contantes
//se utilizan para definir como deberan comportarse las clases "hijas"
public interface Empleados {
	
	public String getTareas(); //metodo abtracto no tiene cuerpo {}
	
	//este metodo lo utilzaremos para la inyeccion de dependencias 
	public String getInformes();

}