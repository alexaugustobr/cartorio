package vc.com.cartorios.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import vc.com.cartorios.exception.CartorioNotFoundException;
import vc.com.cartorios.to.ErrorDetailTO;

@ControllerAdvice
public class CartorioExceptionHandler {

	@ExceptionHandler(CartorioNotFoundException.class)
	public ResponseEntity<ErrorDetailTO> handleLivroNaoEncontradoException(CartorioNotFoundException e,
			HttpServletRequest request) {

		ErrorDetailTO erro = new ErrorDetailTO();
		erro.setStatus(404L);
		erro.setTitulo("O cartório não foi encontrado.");
		erro.setTimestamp(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

}
