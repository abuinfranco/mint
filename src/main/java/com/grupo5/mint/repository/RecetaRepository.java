package com.grupo5.mint.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.mint.entity.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Long> {

    void save(Optional<Receta> RecetaToUpdate);

}
