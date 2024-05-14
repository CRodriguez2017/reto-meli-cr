package com.mercadolibre.backend.apirest.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolibre.backend.apirest.client.service.IArcanService;
import com.mercadolibre.backend.apirest.entity.Favorites;
import com.mercadolibre.backend.apirest.entity.dto.favorite.FavoritesResponse;
import com.mercadolibre.backend.apirest.services.IFavoriteService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FavoriteServiceImpl implements IFavoriteService{
	
	@Autowired
	private IArcanService arcanService;

	@Override
	public List<FavoritesResponse> getFavoritesByUser() {
		log.info("REQUEST");
		//log.info(itemCoupon.toString());
		
		List<Favorites> favorites = arcanService.getFavorites();
	
		List<FavoritesResponse> favoriteItemList = favorites.stream().map(
				item -> FavoritesResponse.builder()
							.id(item.nombre_producto)
							.quantity(item.cantidad_registros)
							.build()).collect(Collectors.toList());
		
		
		
		//FavoritesResponse favoriteResponse = obtenerFavoritos(favorites);
		
		log.info("Items favoritos");
		log.info(favorites.toString());
		
		//favoriteResponse.setId("prieba");
		//favoriteResponse.setQuantity(2);
		
		log.info("Items favoritos luego");
		//log.info(favoriteResponse.toString());
		
		//log.info("Items en cupon");
		//log.info(itemCouponResponse.getItems().toString());
		
		return favoriteItemList;
		//return favoriteResponse;
	}

}
