package com.grupo5.mint.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.mint.entity.Medico;


@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

    void save(Optional<Medico> MedicoToUpdate);

}
    
