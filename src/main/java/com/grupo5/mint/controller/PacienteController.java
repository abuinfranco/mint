package com.grupo5.mint.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo5.mint.entity.Paciente;
import com.grupo5.mint.service.PacienteService;

@RestController
//@RequestMapping("/url")
public class PacienteController {

	@Autowired // (required = false)
	PacienteService pacienteService;

	@RequestMapping(value = "/pacientes", method = RequestMethod.GET, produces = "application/json")
	public List<Paciente> getPaciente() {
		return pacienteService.findAllPaciente();
	}

	@RequestMapping(value = "/pacientes/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Paciente> getPacientes(@PathVariable Long id) {
		return pacienteService.findPacienteById(id);
	}

	@RequestMapping(value = "/pacientes/add", method = RequestMethod.POST, produces = "application/json")
	public Paciente addPostPost(Paciente paciente) {
		return pacienteService.savePaciente(paciente);
	}

	@RequestMapping(value = "/pacientes/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deletePost(@PathVariable Long id) {
		return pacienteService.deletePaciente(id);
	}

	@RequestMapping(value = "/pacientes/update", method = RequestMethod.PUT, produces = "application/json")
	public String updatePacientes(Paciente paciente) {
		return pacienteService.updatePaciente(paciente);
	}
}
