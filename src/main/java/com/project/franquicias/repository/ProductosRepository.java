package com.project.franquicias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.franquicias.entity.ProductoEntity;

public interface ProductosRepository extends JpaRepository<ProductoEntity, Long>{
	
	List<ProductoEntity> findByIdSucursal(Long idSucursal);
	ProductoEntity findByIdProducto(Long idProducto);

}