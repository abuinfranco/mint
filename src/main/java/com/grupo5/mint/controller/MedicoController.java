package com.grupo5.mint.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo5.mint.entity.Medico;
import com.grupo5.mint.service.MedicoService;

@RestController
//@RequestMapping("/url")
public class MedicoController {

	@Autowired // (required = false)
	MedicoService medicoService;

	@RequestMapping(value = "/medicos", method = RequestMethod.GET, produces = "application/json")
	public List<Medico> getMedico() {
		return medicoService.findAllMedico();
	}

	@RequestMapping(value = "/medicos/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Medico> getMedicos(@PathVariable Long id) {
		return medicoService.findMedicoById(id);
	}

	@RequestMapping(value = "/medicos/add", method = RequestMethod.POST, produces = "application/json")
	public Medico addPostPost(Medico medico) {
		return medicoService.saveMedico(medico);
	}

	@RequestMapping(value = "/medicoss/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deletePost(@PathVariable Long id) {
		return medicoService.deleteMedico(id);
	}

	@RequestMapping(value = "/medicos/update", method = RequestMethod.PUT, produces = "application/json")
	public String updateMedicos(Medico medico) {
		return medicoService.updateMedico(medico);
	}
}
