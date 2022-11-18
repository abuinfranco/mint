package com.grupo5.mint.entity;

import java.util.Collection;


import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "farmacias")
@XmlRootElement
public class Farmacia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	@Basic(optional = false)
	@Column(name = "cuil_cuit_farmacia")
	private Long cuil_cuit_farmacia;
	@Basic(optional = false)
	@Column(name = "nombre_farmacia")
	private String nombre_farmacia;
	@Basic(optional = false)
	@Column(name = "matricula")
	private String matricula;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id_farmacia")
	private Collection<Receta> recetaCollection;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCuil_cuit_farmacia() {
		return cuil_cuit_farmacia;
	}
	public void setCuil_cuit_farmacia(Long cuil_cuit_farmacia) {
		this.cuil_cuit_farmacia = cuil_cuit_farmacia;
	}
	public String getNombre_farmacia() {
		return nombre_farmacia;
	}
	public void setNombre_farmacia(String nombre_farmacia) {
		this.nombre_farmacia = nombre_farmacia;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
}
