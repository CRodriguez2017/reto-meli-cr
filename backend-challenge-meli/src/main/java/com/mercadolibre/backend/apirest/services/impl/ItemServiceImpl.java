package com.mercadolibre.backend.apirest.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolibre.backend.apirest.client.service.IMeliService;
import com.mercadolibre.backend.apirest.entity.Items;
import com.mercadolibre.backend.apirest.entity.dto.item.ItemCouponRequest;
import com.mercadolibre.backend.apirest.entity.dto.item.ItemCouponResponse;
import com.mercadolibre.backend.apirest.services.IItemService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItemServiceImpl implements IItemService{
	
	@Autowired
	private IMeliService meliService;

	@Override
	public ItemCouponResponse getItemsAllowedByCoupon(ItemCouponRequest itemCoupon) {
		log.info("REQUEST");
		log.info(itemCoupon.toString());
		
		List<Items> items = meliService.getItems(String.join(",", itemCoupon.getItems()));
		ItemCouponResponse itemCouponResponse = ItemCouponResponse.obtenerProductos(items, itemCoupon.getAmount().intValue());
		
		
		log.info("Items consultados");
		log.info(items.toString());
		
		log.info("Items en cupon");
		log.info(itemCouponResponse.getItems().toString());
		
		return itemCouponResponse;
	}

}
