package com.mercadolibre.backend.apirest.client.service;

import java.util.List;

import com.mercadolibre.backend.apirest.entity.Favorites;
import com.mercadolibre.backend.apirest.entity.Items;

public interface IMeliService {
	
	public List<Items> getItems(String ids);
	
	public List<Favorites> getFavorites();

}
