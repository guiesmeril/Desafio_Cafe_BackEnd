package desafio.cafemanha.desafio.erros;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import desafio.cafemanha.desafio.exceptions.ExceptionCpfAlreadyRegistered;
import desafio.cafemanha.desafio.exceptions.ExceptionItemAlreadyRegistered;

@ControllerAdvice
public class ExceptionHandler {

	public ResponseEntity<Error> cpfAlreadyRegistered(ExceptionCpfAlreadyRegistered e, HttpServletRequest request){
		
		Error error = new Error();
		error.setTimestamp(Instant.now());
		error.setStatus(409);
		error.setMessage(e.getMessage());
		error.setError("Esse cpf já está cadastrado");
		error.setPath(request.getRequestURI());
		
		return ResponseEntity.status(409).body(error);
		
	}
	
public ResponseEntity<Error> itemAlreadyRegistered(ExceptionItemAlreadyRegistered e, HttpServletRequest request){
		
		Error error = new Error();
		error.setTimestamp(Instant.now());
		error.setStatus(409);
		error.setMessage(e.getMessage());
		error.setError("Esse item já está cadastrado");
		error.setPath(request.getRequestURI());
		
		return ResponseEntity.status(409).body(error);
		
	}
}
