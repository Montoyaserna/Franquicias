package com.project.franquicias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.franquicias.entity.SucursalEntity;

public interface SucursalesRepository extends JpaRepository<SucursalEntity, Long>{
	
	List<SucursalEntity> findByIdFranquicia(Long idFranquicia);

}