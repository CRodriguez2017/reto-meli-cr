package com.mercadolibre.backend.apirest.entity.dto.favorite;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FavoritesResponse {
	
	private String id;
	
	private Integer quantity;

}
