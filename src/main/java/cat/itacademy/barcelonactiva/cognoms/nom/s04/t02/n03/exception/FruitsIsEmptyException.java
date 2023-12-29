package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.exception;

public class FruitsIsEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FruitsIsEmptyException(String message) {
		super(message);
	}

	public FruitsIsEmptyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	
}
