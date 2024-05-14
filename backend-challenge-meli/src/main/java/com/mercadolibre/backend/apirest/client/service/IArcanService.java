package com.mercadolibre.backend.apirest.client.service;

import java.util.List;

import com.mercadolibre.backend.apirest.entity.Favorites;

public interface IArcanService {
	
	public List<Favorites> getFavorites();

}
