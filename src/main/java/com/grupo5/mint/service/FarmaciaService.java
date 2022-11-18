package com.grupo5.mint.service;

import java.util.List;


import java.util.Optional;

import com.grupo5.mint.entity.Farmacia;

public interface FarmaciaService {
	
	public List<Farmacia> findAllFarmacia();

    public Optional<Farmacia> findFarmaciaById(Long id);

    public Farmacia saveFarmacia(Farmacia newFarmacia);

    public String deleteFarmacia(Long id);

    public String updateFarmacia(Farmacia farmacia);
}
