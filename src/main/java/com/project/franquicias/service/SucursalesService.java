package com.project.franquicias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.franquicias.repository.SucursalesRepository;

@Service
public class SucursalesService {
	
	@Autowired
	SucursalesRepository sucursalesRepository;
	
	String code = "";
	String message = "";

}
