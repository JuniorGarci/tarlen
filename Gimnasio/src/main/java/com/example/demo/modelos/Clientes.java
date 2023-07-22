package com.example.demo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
public class Clientes {
	
	@Id
	@Column(name="dni")
	private String identidad;
	
	private String nombre;
	
	private String apellido;
	
	private int fechanacimiento;
	
	

}
