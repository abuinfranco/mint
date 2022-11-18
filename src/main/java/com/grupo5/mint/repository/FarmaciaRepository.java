package com.grupo5.mint.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.mint.entity.Farmacia;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {

    void save(Optional<Farmacia> FarmaciaToUpdate);

}