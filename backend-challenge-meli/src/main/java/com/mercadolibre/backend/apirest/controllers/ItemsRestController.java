package com.mercadolibre.backend.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolibre.backend.apirest.entity.dto.item.ItemCouponRequest;
import com.mercadolibre.backend.apirest.entity.dto.item.ItemCouponResponse;
import com.mercadolibre.backend.apirest.services.IItemService;

@RestController
@RequestMapping("/api")
public class ItemsRestController {
	
	@Autowired
	private IItemService itemService;
	
	@PostMapping("/coupon")
	public ResponseEntity<ItemCouponResponse> create(
			@RequestBody ItemCouponRequest itemsCoupon) {
		return new ResponseEntity<ItemCouponResponse>( 
				itemService.getItemsAllowedByCoupon(itemsCoupon), HttpStatus.OK);
	}

}
