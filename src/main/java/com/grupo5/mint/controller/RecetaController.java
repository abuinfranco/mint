package com.grupo5.mint.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo5.mint.entity.Receta;
import com.grupo5.mint.service.RecetaService;

@RestController
//@RequestMapping("/url")
public class RecetaController {

	@Autowired // (required = false)
	RecetaService recetaService;

	@RequestMapping(value = "/recetas", method = RequestMethod.GET, produces = "application/json")
	public List<Receta> getReceta() {
		return recetaService.findAllReceta();
	}

	@RequestMapping(value = "/recetas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Receta> getReceta(@PathVariable Long id) {
		return recetaService.findRecetaById(id);
	}

	@RequestMapping(value = "/recetas/add", method = RequestMethod.POST, produces = "application/json")
	public Receta addPostPost(Receta receta) {
		return recetaService.saveReceta(receta);
	}

	@RequestMapping(value = "/recetas/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public String deletePost(@PathVariable Long id) {
		return recetaService.deleteReceta(id);
	}

	@RequestMapping(value = "/recetas/update", method = RequestMethod.PUT, produces = "application/json")
	public String updateRecetas(Receta receta) {
		return recetaService.updateReceta(receta);
	}
}
