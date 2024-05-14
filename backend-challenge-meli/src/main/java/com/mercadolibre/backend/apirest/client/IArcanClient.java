package com.mercadolibre.backend.apirest.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mercadolibre.backend.apirest.entity.Favorites;

@FeignClient(url = "https://arcancode.com", contextId = "arcanClient", name = "arcanClient")
public interface IArcanClient { 
	
	
	@GetMapping(path = "/backend/getItemsFavorites.php")
	public List<Favorites> getFavorites();
}
