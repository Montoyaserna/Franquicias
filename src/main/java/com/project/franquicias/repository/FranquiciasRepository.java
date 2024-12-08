package com.project.franquicias.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.franquicias.entity.FranquiciaEntity;

public interface FranquiciasRepository extends JpaRepository<FranquiciaEntity, Long>{
	
	List<FranquiciaEntity> findAll();
	FranquiciaEntity findByIdFranquicia(Long idFranquicia);

}