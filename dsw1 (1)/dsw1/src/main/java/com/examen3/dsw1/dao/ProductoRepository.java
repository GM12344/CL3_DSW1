package com.examen3.dsw1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen3.dsw1.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {

}
