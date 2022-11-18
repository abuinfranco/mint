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
@Table(name = "medicos")
@XmlRootElement
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	@Basic(optional = false)
	@Column(name = "dni_medico")
	private Long dni_medico;
	@Basic(optional = false)
	@Column(name = "mn")
	private Long mn;
	@Basic(optional = false)
	@Column(name = "nombre_medico")
	private String nombre_medico;
	@Basic(optional = false)
	@Column(name = "apellido_medico")
	private String apellido_medico;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id_medico")
	private Collection<Receta> recetaCollection;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDni_medico() {
		return dni_medico;
	}
	public void setDni_medico(Long dni_medico) {
		this.dni_medico = dni_medico;
	}
	public Long getMn() {
		return mn;
	}
	public void setMn(Long mn) {
		this.mn = mn;
	}
	public String getNombre_medico() {
		return nombre_medico;
	}
	public void setNombre_medico(String nombre_medico) {
		this.nombre_medico = nombre_medico;
	}
	public String getApellido_medico() {
		return apellido_medico;
	}
	public void setApellido_medico(String apellido_medico) {
		this.apellido_medico = apellido_medico;
	}
	
	
	

}
