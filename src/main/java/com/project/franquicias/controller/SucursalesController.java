package com.project.franquicias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.franquicias.entity.SucursalEntity;
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
	
	@PostMapping(value = "/insert", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> insertFranquicia(@RequestBody SucursalEntity sucursalEntity) {
		return sucursalesService.insertSucursal(sucursalEntity);

	}
	
	@PutMapping(value = "/update", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> updateSucursal(@RequestBody SucursalEntity sucursalEntity) {
		return sucursalesService.updateSucursal(sucursalEntity);

	}

}
