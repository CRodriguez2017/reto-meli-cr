package com.mercadolibre.backend.apirest.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mercadolibre.backend.apirest.client.IMeliClient;
import com.mercadolibre.backend.apirest.client.service.IMeliService;
import com.mercadolibre.backend.apirest.entity.Favorites;
import com.mercadolibre.backend.apirest.entity.Items;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MeliServiceImpl implements IMeliService {
	
	@Autowired
	private IMeliClient meliClient;
	
	@Value("${clients.meli.auth}")
	private String authToken;

	@Override
	public List<Items> getItems(String ids) {
		
		log.info("Auth");
		log.info(authToken);
		
		return meliClient.getItems(String.format("Bearer %s", authToken), ids, "id,price");
	
	}
	
	@Override
	public List<Favorites> getFavorites() {
		
		log.info("Auth");
		log.info(authToken);
		
		return meliClient.getFavorites(String.format("Bearer %s", authToken));
	
	}

}
