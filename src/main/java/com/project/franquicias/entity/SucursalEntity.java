package com.project.franquicias.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sucursal")
public class SucursalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sucursal", nullable = false)
    private Long idSucursal;
	
	@Column(name = "nombre_sucursal", nullable = false)
    private String nombreSucursal;
	
	@Column(name = "id_franquicia", nullable = false)
    private Long idFranquicia;

}
