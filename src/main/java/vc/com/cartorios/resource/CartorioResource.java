package vc.com.cartorios.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vc.com.cartorios.service.CartorioService;
import vc.com.cartorios.to.CartorioTO;

@RestController
@RequestMapping(path = "/cartorio/api", produces = { MediaType.APPLICATION_JSON_VALUE })
public class CartorioResource {

	@Autowired
	private CartorioService cartorioService;

	@GetMapping
	public ResponseEntity<List<CartorioTO>> listAll() {
		return ResponseEntity.status(HttpStatus.OK).body(cartorioService.listAll());
	}

}
