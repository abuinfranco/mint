package com.grupo5.mint.service;

import java.util.List;

import java.util.Optional;

import com.grupo5.mint.entity.Paciente;

public interface PacienteService {

	public List<Paciente> findAllPaciente();

    public Optional<Paciente> findPacienteById(Long id);

    public Paciente savePaciente(Paciente newPaciente);

    public String deletePaciente(Long id);

    public String updatePaciente(Paciente paciente);
}
