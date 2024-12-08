package com.project.franquicias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.franquicias.service.FranquiciasService;

@RestController
@RequestMapping("/v1/api/franquicias")
public class FranquiciasController {
	
	@Autowired
	FranquiciasService franquiciaService;
	
	@GetMapping(value = "/select-all", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> selectAllFranquicias() {
		return franquiciaService.selectAllFranquicias();

	}

}
