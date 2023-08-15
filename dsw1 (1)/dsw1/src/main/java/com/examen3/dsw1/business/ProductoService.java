package com.examen3.dsw1.business;

import java.util.List;

import com.examen3.dsw1.model.Producto;



public interface ProductoService {
	List<Producto>listarProducto();
	void  registrarProducto(Producto Producto);
	Producto listaProductoPorId(int id);
	void  eliminarProducto(int id);
}
