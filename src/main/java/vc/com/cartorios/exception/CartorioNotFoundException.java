package vc.com.cartorios.exception;

public class CartorioNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3055857075721271884L;

	public CartorioNotFoundException(String mensagem) {
		super(mensagem);
	}

	public CartorioNotFoundException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
