package com.grupo5.mint.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo5.mint.repository.PacienteRepository;
import com.grupo5.mint.entity.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired(required = false)
	private PacienteRepository pacienteRepository;

	@Override
	public List<Paciente> findAllPaciente() {
		return pacienteRepository.findAll();
	}

	@Override
	public Optional<Paciente> findPacienteById(Long id) {
		return pacienteRepository.findById(id);
	}

	@Override
	public Paciente savePaciente(Paciente newPaciente) {
		return pacienteRepository.save(newPaciente);
	}

	@Override
	public String deletePaciente(Long id) {
		if (pacienteRepository.findById(id) != null)
        {
            pacienteRepository.deleteById(id);
            return "OK";
        }
        return "error: id no existe";
    }

	@Override
	public String updatePaciente(Paciente paciente) {
		if (pacienteRepository.findById(paciente.getId()) != null)
        {
            pacienteRepository.save(paciente);
            return "OK";
        }

        return "error: id no existe";
    }

}
