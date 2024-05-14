package com.mercadolibre.backend.apirest.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mercadolibre.backend.apirest.client.IArcanClient;
import com.mercadolibre.backend.apirest.client.service.IArcanService;
import com.mercadolibre.backend.apirest.entity.Favorites;


@Service

public class ArcanServiceImpl implements IArcanService {
	
	@Autowired
	private IArcanClient arcanClient;
	
	
	@Override
	public List<Favorites> getFavorites() {
		
		return arcanClient.getFavorites();
	
	}

}
