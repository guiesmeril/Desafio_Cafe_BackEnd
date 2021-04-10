package desafio.cafemanha.desafio.exceptions;

public class ExceptionItemAlreadyRegistered extends RuntimeException { 
	private static final long serialVersionUID = 1L;

	public ExceptionItemAlreadyRegistered(String message) {
		super(message);
	}

}
