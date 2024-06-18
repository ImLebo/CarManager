package com.carcreate.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TBL_CAR")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	@Column(name = "marca")
	private String marca;

	@Column(name = "modelo")
	private String modelo;

	@Column(name = "año")
	private String año;

	@Column(name = "color")
	private String color;

	@Column(name = "precio")
	private double precio; 

	@Column(name = "tipo")
	private String tipo; 

	@Column(name = "concesionaria")
	private String concesionaria;

	@Column(name = "cargarimagen")
	private byte[] cargarimagen;
	
	public Car(String marca, String modelo, String año, String color, double precio, String tipo, String concesionaria,
			byte[] cargarimagen) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.precio = precio;
		this.tipo = tipo;
		this.concesionaria = concesionaria;
		this.cargarimagen = cargarimagen;
	}

	public Car(){}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return modelo;
	}

	public void setModel(String modelo) {
		this.modelo = modelo;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getConcesionaria() {
		return concesionaria;
	}

	public void setConcesionaria(String concesionaria) {
		this.concesionaria = concesionaria;
	}

	public byte[] getCargarimagen() {
		return cargarimagen;
	}

	public void setCargarimagen(byte[] cargarimagen) {
		this.cargarimagen = cargarimagen;
	} 

	
	
}
