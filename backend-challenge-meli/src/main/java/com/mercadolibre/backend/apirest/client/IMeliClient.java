package com.mercadolibre.backend.apirest.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.mercadolibre.backend.apirest.entity.Favorites;
import com.mercadolibre.backend.apirest.entity.Items;

@FeignClient(url = "https://api.mercadolibre.com", contextId = "meliClient", name = "meliClient")
public interface IMeliClient { 
	
	@GetMapping(path = "/items")
	public List<Items> getItems(
			@RequestHeader(name = "Authorization") String authorization,
			@RequestParam(name = "ids") String ids,
			@RequestParam(name = "attributes") String attributes);
	
	@GetMapping(path = "users/me/bookmarks")
	public List<Favorites> getFavorites(
			@RequestHeader(name = "Authorization") String authorization);
}
