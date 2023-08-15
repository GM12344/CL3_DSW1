package com.examen3.dsw1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
	@Table(name="tb_producto")
    @AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	@ToString



	public class Producto {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="id_producto")
	private int id_producto;
	private String nombre;
	private Double precio;
	private int cantidad;

	}



