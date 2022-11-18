package com.grupo5.mint.service;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo5.mint.entity.Farmacia;
import com.grupo5.mint.repository.FarmaciaRepository;

@Service
public class FarmaciaServiceImpl implements FarmaciaService {
	
	@Autowired(required = false)
	private FarmaciaRepository farmaciaRepository;

	@Override
	public List<Farmacia> findAllFarmacia() {
		return farmaciaRepository.findAll();
	}

	@Override
	public Optional<Farmacia> findFarmaciaById(Long id) {
		return farmaciaRepository.findById(id);
	}

	@Override
	public Farmacia saveFarmacia(Farmacia newFarmacia) {
		return farmaciaRepository.save(newFarmacia);
	}

	@Override
	public String deleteFarmacia(Long id) {
		if (farmaciaRepository.findById(id) != null)
        {
            farmaciaRepository.deleteById(id);
            return "OK";
        }
        return "error: id no existe";
    }

	@Override
	public String updateFarmacia(Farmacia farmacia) {
		if (farmaciaRepository.findById(farmacia.getId()) != null)
        {
            farmaciaRepository.save(farmacia);
            return "OK";
        }

        return "error: id no existe";
    }
}
