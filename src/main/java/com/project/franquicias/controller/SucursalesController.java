package com.project.franquicias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.franquicias.service.SucursalesService;

@RestController
@RequestMapping("/v1/api/sucursales")
public class SucursalesController {
	
	@Autowired
	SucursalesService sucursalesService;
	
	@GetMapping(value = "/select-by-id-franquicia/{idFranquicia}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> selectAllSucursales(@PathVariable Long idFranquicia) {
		return sucursalesService.selectAllSucursales(idFranquicia);

	}

}
