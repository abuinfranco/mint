package com.grupo5.mint.service;

import java.util.List;

import java.util.Optional;

import com.grupo5.mint.entity.Receta;

public interface RecetaService {

	public List<Receta> findAllReceta();

    public Optional<Receta> findRecetaById(Long id);

    public Receta saveReceta(Receta newReceta);

    public String deleteReceta(Long id);

    public String updateReceta(Receta receta);
}
