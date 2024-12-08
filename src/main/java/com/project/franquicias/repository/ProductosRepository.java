package com.project.franquicias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.franquicias.entity.FranquiciaEntity;

public interface ProductosRepository extends JpaRepository<FranquiciaEntity, Long>{

}