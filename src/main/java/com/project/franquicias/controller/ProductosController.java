package com.project.franquicias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.franquicias.service.ProductosService;

@RestController
@RequestMapping("/v1/api/productos")
public class ProductosController {
	
	@Autowired
	ProductosService productosService;
	
	@GetMapping(value = "/select-by-id-sucursal/{idSucursal}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<?> selectAllSucursales(@PathVariable Long idSucursal) {
		return productosService.selectAllProductos(idSucursal);

	}
	
}
