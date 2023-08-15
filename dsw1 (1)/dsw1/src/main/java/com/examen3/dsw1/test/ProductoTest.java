package com.examen3.dsw1.test;

import com.examen3.dsw1.model.Producto;

public class ProductoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			Producto objeto1 = new Producto(1,"Gasesosa Coca Cola",9.7,6);
			System.out.println("Datos de objeto =>" + objeto1);
			
			Producto objeto2 = new Producto();
			objeto2.setId_producto(1);;
			objeto2.setNombre("Inka kola");
			objeto2.setCantidad(5);
		
			System.out.println("Datos de objeto =>" + objeto2);
			
			
			
			
			
	}
}
