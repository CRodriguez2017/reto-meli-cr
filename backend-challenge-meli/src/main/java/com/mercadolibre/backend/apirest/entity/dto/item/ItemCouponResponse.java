package com.mercadolibre.backend.apirest.entity.dto.item;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.backend.apirest.entity.Items;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCouponResponse {
	
	private List<String> items;
	
	private Double total;
	
	public static ItemCouponResponse obtenerProductos(List<Items> productos, Integer cupon) {
        int n = productos.size();
        int[][] dp = new int[n + 1][cupon + 1];

        // Llenar la tabla dp con los valores óptimos
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cupon; j++) {
                if (productos.get(i - 1).getBody().getPrice() <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - productos.get(i - 1).getBody().getPrice()] + productos.get(i - 1).getBody().getPrice());
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Reconstruir la solución
        List<String> productosSeleccionados = new ArrayList<>();
        int i = n;
        int j = cupon;
        Integer total = 0;
        while (i > 0 && j > 0) {
            if (dp[i][j] != dp[i - 1][j]) {
                productosSeleccionados.add(productos.get(i - 1).getBody().getId());
                j -= productos.get(i - 1).getBody().getPrice();
                total += productos.get(i - 1).getBody().getPrice();
            }
            i--;
        }

        return ItemCouponResponse.builder()
				.items(productosSeleccionados)
				.total(Double.parseDouble(total.toString()))
				.build();
    }

}
