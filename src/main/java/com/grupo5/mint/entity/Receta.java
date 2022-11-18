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
	private Paciente idPaciente;
	@JoinColumn(name = "id_farmacia", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Farmacia idFarmacia;
	@JoinColumn(name = "id_medico", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Medico idMedico;
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFarmacia")
	//private Collection<Profesor> profesorCollection;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Farmacia getIdFarmacia() {
		return idFarmacia;
	}
	public void setIdFarmacia(Farmacia idFarmacia) {
		this.idFarmacia = idFarmacia;
	}
	public Medico getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Medico idMedico) {
		this.idMedico = idMedico;
	}

	
	
	
}
