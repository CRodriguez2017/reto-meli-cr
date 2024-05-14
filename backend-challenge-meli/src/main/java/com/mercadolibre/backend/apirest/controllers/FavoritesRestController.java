package com.mercadolibre.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolibre.backend.apirest.entity.dto.favorite.FavoritesResponse;
import com.mercadolibre.backend.apirest.services.IFavoriteService;

@RestController
@RequestMapping("/api")
public class FavoritesRestController {
	
	@Autowired
	private IFavoriteService favoriteService;
	
	@GetMapping("/coupon/stats")
	public ResponseEntity<List<FavoritesResponse>> responseEntity() {
		
		return new ResponseEntity<List<FavoritesResponse>>(
				favoriteService.getFavoritesByUser(), HttpStatus.OK);
	}

}
