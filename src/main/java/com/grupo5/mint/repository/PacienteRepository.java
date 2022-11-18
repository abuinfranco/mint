package com.grupo5.mint.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.mint.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    void save(Optional<Paciente> PacienteToUpdate);

}
