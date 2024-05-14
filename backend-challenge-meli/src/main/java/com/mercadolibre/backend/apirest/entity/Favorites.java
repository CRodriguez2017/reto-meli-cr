package com.mercadolibre.backend.apirest.entity;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Favorites {
	
	public String nombre_producto;

	public Integer cantidad_registros;

}
