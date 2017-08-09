package vc.com.cartorios.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vc.com.cartorios.component.CartorioTranslator;
import vc.com.cartorios.domain.CartorioEntity;
import vc.com.cartorios.exception.CartorioNotFoundException;
import vc.com.cartorios.repository.CartorioRepository;
import vc.com.cartorios.to.CartorioTO;

@Service
public class CartorioService {

	@Autowired
	private CartorioRepository cartorioRepository;

	@Autowired
	private CartorioTranslator translator;

	public CartorioTO save(CartorioTO cartorioTO) {

		CartorioEntity entity = translator.toEntity(cartorioTO);
		cartorioRepository.save(entity);
		return translator.toTO(entity);
	}

	public List<CartorioTO> listAll() {

		return translator.toListTO(cartorioRepository.findAll());
	}

	public CartorioEntity findById(Long id) {

		CartorioEntity entity = cartorioRepository.findOne(id);
		if (entity == null)
			throw new CartorioNotFoundException("Cartorio \"" + id + "\" inexistente.");
		return entity;
	}

	public void delete(Long id) {
		cartorioRepository.delete(id);
	}

}
