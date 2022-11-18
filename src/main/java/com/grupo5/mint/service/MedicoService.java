package com.grupo5.mint.service;

import java.util.List;

import java.util.Optional;

import com.grupo5.mint.entity.Medico;

public interface MedicoService {

	public List<Medico> findAllMedico();

    public Optional<Medico> findMedicoById(Long id);

    public Medico saveMedico(Medico newMedico);

    public String deleteMedico(Long id);

    public String updateMedico(Medico medico);
}
