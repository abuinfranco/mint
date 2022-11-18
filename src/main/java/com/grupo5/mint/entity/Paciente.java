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
@Table(name = "pacientes")
@XmlRootElement
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	@Basic(optional = false)
	@Column(name = "dni_paciente")
	private Long dni_paciente;
	@Basic(optional = false)
	@Column(name = "nombre_paciente")
	private String nombre_paciente;
	@Basic(optional = false)
	@Column(name = "apellido_paciente")
	private String apellido_paciente;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaciente")
	private Collection<Receta> recetaCollection;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDni_paciente() {
		return dni_paciente;
	}
	public void setDni_paciente(Long dni_paciente) {
		this.dni_paciente = dni_paciente;
	}
	public String getNombre_paciente() {
		return nombre_paciente;
	}
	public void setNombre_paciente(String nombre_paciente) {
		this.nombre_paciente = nombre_paciente;
	}
	public String getApellido_paciente() {
		return apellido_paciente;
	}
	public void setApellido_paciente(String apellido_paciente) {
		this.apellido_paciente = apellido_paciente;
	}

	
}
