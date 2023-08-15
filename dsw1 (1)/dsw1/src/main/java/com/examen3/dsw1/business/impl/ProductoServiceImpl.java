package com.examen3.dsw1.business.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.examen3.dsw1.business.ProductoService;
import com.examen3.dsw1.dao.ProductoRepository;
import com.examen3.dsw1.model.Producto;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor

public class ProductoServiceImpl implements ProductoService{
	private ProductoRepository repository;

	@Override
	public List<Producto> listarProducto() {
		return  repository.findAll();
	}

	@Override
	public void registrarProducto(Producto Producto) {
		repository.save(Producto);
	}

	@Override
	public Producto listaProductoPorId(int id) {
		Optional<Producto> objeto = repository.findById(id);

        Producto producto = null;
		if (objeto.isPresent()) {

			producto = objeto.get(); 
		} else {

			throw new RuntimeException("Producto con el id " + id + " no fue encontrado!!!");

		}
		return producto;
      }

	

	@Override
	public void eliminarProducto(int id) {
		repository.deleteById(id);
	}

}
