package com.project.franquicias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.franquicias.entity.ProductoEntity;
import com.project.franquicias.payload.response.ResponseGeneric;
import com.project.franquicias.repository.ProductosRepository;

@Service
public class ProductosService {
	
	@Autowired
	ProductosRepository productosRepository;
	
	String code = "";
	String message = "";
	
	public ResponseEntity<?> selectAllProductos(Long idSucursal) {
		try {
			List<ProductoEntity> productos = productosRepository.findByIdSucursal(idSucursal);
			
			if (productos.size() > 0) {
				code = "0";
				message = "se ha encontrado información";
			} else {
				code = "1";
				message = "No se ha encontrado información";
			}
			
			return ResponseEntity.ok(new ResponseGeneric(code, message, productos));
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return ResponseEntity.ok(new ResponseGeneric("2", "Error al consultar"));
		}
	}
	
}
