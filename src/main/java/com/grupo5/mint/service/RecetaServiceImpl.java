package com.grupo5.mint.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo5.mint.repository.RecetaRepository;
import com.grupo5.mint.entity.Receta;

@Service
public class RecetaServiceImpl implements RecetaService {
	
	@Autowired(required = false)
	private RecetaRepository recetaRepository;

	@Override
	public List<Receta> findAllReceta() {
		return recetaRepository.findAll();
	}

	@Override
	public Optional<Receta> findRecetaById(Long id) {
		return recetaRepository.findById(id);
	}

	@Override
	public Receta saveReceta(Receta newReceta) {
		return recetaRepository.save(newReceta);
	}

	@Override
	public String deleteReceta(Long id) {
		if (recetaRepository.findById(id) != null)
        {
            recetaRepository.deleteById(id);
            return "OK";
        }
        return "error: id no existe";
    }

	@Override
	public String updateReceta(Receta receta) {
		if (recetaRepository.findById(receta.getId()) != null)
        {
            recetaRepository.save(receta);
            return "OK";
        }

        return "error: id no existe";
    }

}
