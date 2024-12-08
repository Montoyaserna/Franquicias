package com.project.franquicias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.franquicias.entity.FranquiciaEntity;
import com.project.franquicias.entity.SucursalEntity;
import com.project.franquicias.payload.response.ResponseGeneric;
import com.project.franquicias.repository.SucursalesRepository;

@Service
public class SucursalesService {
	
	@Autowired
	SucursalesRepository sucursalesRepository;
	
	String code = "";
	String message = "";
	
	public ResponseEntity<?> selectAllSucursales(Long idFranquicia) {
		try {
			List<SucursalEntity> sucursales = sucursalesRepository.findByIdFranquicia(idFranquicia);
			
			if (sucursales.size() > 0) {
				code = "0";
				message = "se ha encontrado información";
			} else {
				code = "1";
				message = "No se ha encontrado información";
			}
			
			return ResponseEntity.ok(new ResponseGeneric(code, message, sucursales));
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return ResponseEntity.ok(new ResponseGeneric("2", "Error al consultar"));
		}
	}
	
	public ResponseEntity<?> insertSucursal(SucursalEntity sucursalEntity) {
		try {
			sucursalesRepository.save(sucursalEntity);
			
			return ResponseEntity.ok(new ResponseGeneric("0", "Se Creo la Sucursal Exitosamente"));
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return ResponseEntity.ok(new ResponseGeneric("2", "Error al Insertar"));
		}
	}
	
}
