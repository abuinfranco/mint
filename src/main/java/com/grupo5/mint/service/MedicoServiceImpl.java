package com.grupo5.mint.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo5.mint.repository.MedicoRepository;
import com.grupo5.mint.entity.Medico;

@Service
public class MedicoServiceImpl implements MedicoService {

	@Autowired(required = false)
	private MedicoRepository medicoRepository;
	
	@Override
	public List<Medico> findAllMedico() {
		return medicoRepository.findAll();
	}

	@Override
	public Optional<Medico> findMedicoById(Long id) {
		return medicoRepository.findById(id);
	}

	@Override
	public Medico saveMedico(Medico newMedico) {
		return medicoRepository.save(newMedico);
	}

	@Override
	public String deleteMedico(Long id) {
		if (medicoRepository.findById(id) != null)
        {
            medicoRepository.deleteById(id);
            return "OK";
        }
        return "error: id no existe";
    }

	@Override
	public String updateMedico(Medico medico) {
		if (medicoRepository.findById(medico.getId()) != null)
        {
            medicoRepository.save(medico);
            return "OK";
        }

        return "error: id no existe";
    }

}
