package com.grupo5.mint.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.grupo5.mint.entity.Receta;

@Entity
@Table(name = "recetas")
@XmlRootElement
public class Receta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	@JoinColumn(name = "id_paciente", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Paciente id_paciente;
	@JoinColumn(name = "id_farmacia", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Farmacia id_farmacia;
	@JoinColumn(name = "id_medico", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Medico id_medico;
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFarmacia")
	//private Collection<Profesor> profesorCollection;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Paciente getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(Paciente id_paciente) {
		this.id_paciente = id_paciente;
	}
	public Farmacia getId_farmacia() {
		return id_farmacia;
	}
	public void setId_farmacia(Farmacia id_farmacia) {
		this.id_farmacia = id_farmacia;
	}
	public Medico getId_medico() {
		return id_medico;
	}
	public void setId_medico(Medico id_medico) {
		this.id_medico = id_medico;
	}
	
	

	
	
	
}
