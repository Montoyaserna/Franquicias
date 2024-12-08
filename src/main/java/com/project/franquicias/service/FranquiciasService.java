package com.project.franquicias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.franquicias.entity.FranquiciaEntity;
import com.project.franquicias.payload.response.ResponseGeneric;
import com.project.franquicias.repository.FranquiciasRepository;

@Service
public class FranquiciasService {
	
	@Autowired
	FranquiciasRepository franquiciasRepository;
	
	String code = "";
	String message = "";
	
	public ResponseEntity<?> selectAllFranquicias() {
		try {
			List<FranquiciaEntity> franquicias = franquiciasRepository.findAll();
			
			if (franquicias.size() > 0) {
				code = "0";
				message = "se ha encontrado información";
			} else {
				code = "1";
				message = "No se ha encontrado información";
			}
			
			return ResponseEntity.ok(new ResponseGeneric(code, message, franquicias));
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return ResponseEntity.ok(new ResponseGeneric("2", "Error al consultar"));
		}
	}
	
	public ResponseEntity<?> insertFranquicia(FranquiciaEntity franquicia) {
		try {
			franquiciasRepository.save(franquicia);
			
			return ResponseEntity.ok(new ResponseGeneric("0", "Se Creo la Franquicia Exitosamente"));
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return ResponseEntity.ok(new ResponseGeneric("2", "Error al Insertar"));
		}
	}
	
	public ResponseEntity<?> updateFranquicia(FranquiciaEntity franquicia) {
		try {
			FranquiciaEntity franquiciaUpd = franquiciasRepository.findByIdFranquicia(franquicia.getIdFranquicia());
			
			franquiciaUpd.setNombreFranquicia(franquicia.getNombreFranquicia());
			
			franquiciasRepository.save(franquiciaUpd);
			
			return ResponseEntity.ok(new ResponseGeneric("0", "Se Actualizo la Franquicia Exitosamente"));
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return ResponseEntity.ok(new ResponseGeneric("2", "Error al Actualizar"));
		}
	}

}
