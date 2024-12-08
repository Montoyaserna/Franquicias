package com.project.franquicias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.franquicias.service.SucursalesService;

@RestController
@RequestMapping("/v1/api/sucursales")
public class SucursalesController {
	
	@Autowired
	SucursalesService sucursalesService;

}
