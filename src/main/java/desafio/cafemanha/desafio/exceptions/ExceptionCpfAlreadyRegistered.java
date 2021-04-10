package desafio.cafemanha.desafio.exceptions;

public class ExceptionCpfAlreadyRegistered extends RuntimeException { 
	private static final long serialVersionUID = 1L;

	public ExceptionCpfAlreadyRegistered(String message) {
		super(message);
	}

}
