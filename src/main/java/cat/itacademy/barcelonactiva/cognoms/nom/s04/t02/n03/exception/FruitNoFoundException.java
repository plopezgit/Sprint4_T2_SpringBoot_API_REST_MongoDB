package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception;

public class FruitNoFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FruitNoFoundException(String message) {
		super(message);
	}

	public FruitNoFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
