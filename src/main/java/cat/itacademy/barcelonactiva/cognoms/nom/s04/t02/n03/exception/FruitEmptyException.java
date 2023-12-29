package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception;

public class FruitEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FruitEmptyException(String message) {
		super(message);
	}

	public FruitEmptyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
