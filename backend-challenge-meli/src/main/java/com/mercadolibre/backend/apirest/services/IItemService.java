package com.mercadolibre.backend.apirest.services;

import com.mercadolibre.backend.apirest.entity.dto.item.ItemCouponRequest;
import com.mercadolibre.backend.apirest.entity.dto.item.ItemCouponResponse;
public interface IItemService {

	public ItemCouponResponse getItemsAllowedByCoupon(ItemCouponRequest itemCoupon);
	
}
