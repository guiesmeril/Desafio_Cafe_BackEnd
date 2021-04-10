package desafio.cafemanha.desafio.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import desafio.cafemanha.desafio.models.Collaborator;

@RequestMapping("/collaborators")
public interface CollaboratorInterface {
	
	@PostMapping
	public ResponseEntity<Collaborator> inserir(@RequestBody Collaborator collaborator);
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable(required = true) Long id);
	
	@GetMapping("/{cpf}")
	public ResponseEntity<Collaborator> auth(@PathVariable(required = true) String cpf);
	
	@PutMapping
	public ResponseEntity<Collaborator> update(@RequestBody Collaborator collaborator);
	
	@GetMapping
	public ResponseEntity<List<Collaborator>> getCollaborator();
	

}
