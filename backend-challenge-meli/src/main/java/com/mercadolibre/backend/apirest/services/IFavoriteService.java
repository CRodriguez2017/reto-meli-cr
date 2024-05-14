package com.mercadolibre.backend.apirest.services;

import java.util.List;

import com.mercadolibre.backend.apirest.entity.dto.favorite.FavoritesResponse;
public interface IFavoriteService {

	public List<FavoritesResponse> getFavoritesByUser();
	
}
