package com.mercadolibre.backend.apirest.entity;

import com.mercadolibre.backend.apirest.entity.dto.Body;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Items {
	
	public Integer code;

	public Body body;

}
