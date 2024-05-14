package com.mercadolibre.backend.apirest.entity.dto.item;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCouponRequest {

	private List<String> items;

	private Double amount;
	
}
