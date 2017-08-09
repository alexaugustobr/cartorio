package vc.com.cartorios.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import vc.com.cartorios.domain.CartorioEntity;
import vc.com.cartorios.to.CartorioTO;

@Component
public class CartorioTranslator {

	public CartorioEntity toEntity(CartorioTO to) {

		CartorioEntity entity = new CartorioEntity();
		entity.setId(to.getId());
		entity.setDescricao(to.getDescricao());
		return entity;
	}

	public CartorioTO toTO(CartorioEntity entity) {

		CartorioTO to = new CartorioTO();
		to.setId(entity.getId());
		to.setDescricao(entity.getDescricao());
		return to;
	}

	public List<CartorioTO> toListTO(List<CartorioEntity> entityList) {

		List<CartorioTO> toList = new ArrayList<CartorioTO>();
		for (CartorioEntity entity : entityList) {
			CartorioTO to = new CartorioTO();
			to.setId(entity.getId());
			to.setDescricao(entity.getDescricao());
			toList.add(to);
		}
		return toList;
	}
}
