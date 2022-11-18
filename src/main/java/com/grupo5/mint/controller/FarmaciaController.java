package com.grupo5.mint.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo5.mint.entity.Farmacia;
import com.grupo5.mint.service.FarmaciaService;

@RestController
//@RequestMapping("/url")
public class FarmaciaController {
	
	@Autowired // (required = false)
	FarmaciaService farmaciaService;

	@RequestMapping(value = "/farmacias", method = RequestMethod.GET, produces = "application/json")
	public List<Farmacia> getFarmacia() {
		return farmaciaService.findAllFarmacia();
	}

	@RequestMapping(value = "/farmacias/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Farmacia> getFarmacias(@PathVariable Long id) {
		return farmaciaService.findFarmaciaById(id);
	}

	@RequestMapping(value = "/farmacias/add", method = RequestMethod.POST, produces = "application/json")
	public Farmacia addPostPost(Farmacia farmacia) {
		return farmaciaService.saveFarmacia(farmacia);
	}

	@RequestMapping(value = "/farmacias/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deletePost(@PathVariable Long id) {
		return farmaciaService.deleteFarmacia(id);
	}

	@RequestMapping(value = "/farmacias/update", method = RequestMethod.PUT, produces = "application/json")
	public String updateFarmacias(Farmacia farmacia) {
		return farmaciaService.updateFarmacia(farmacia);
	}
	
}
