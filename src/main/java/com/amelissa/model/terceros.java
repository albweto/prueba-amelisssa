package com.amelissa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "terceros")
public class terceros implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(columnDefinition="text")
	private String nombre;
	@Column(columnDefinition="text")
	private int documento;
	@Column(columnDefinition="text")
	private String direccion;
	
	
	public terceros() {
		// TODO Auto-generated constructor stub
	}


	
	
	public terceros(String nombre, int documento, String direccion) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.direccion = direccion;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
