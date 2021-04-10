package desafio.cafemanha.desafio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import desafio.cafemanha.desafio.interfaces.CollaboratorInterface;
import desafio.cafemanha.desafio.models.Collaborator;
import desafio.cafemanha.desafio.service.CollaboratorService;

@RestController
public class CollaboratorController implements CollaboratorInterface {
	
	@Autowired
	private CollaboratorService collaboratorService;

	@Override
	public ResponseEntity<Collaborator> inserir(Collaborator collaborator) { 
		 Collaborator response = collaboratorService.inserir(collaborator);
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Collaborator> update(Collaborator collaborator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Collaborator>> getCollaborator() {
		// TODO Auto-generated method stub
		Collaborator collaborator = new Collaborator();
		collaborator.setId((long) 2);
		collaborator.setCpf(null);
		collaborator.setName(null);
		
		List<Collaborator> collaborators= new ArrayList<>();
		
		collaborators.add(collaborator);
		
		return ResponseEntity.ok().body(collaborators);//<List<Collaborator>>) collaborators;
	}

	@Override
	public ResponseEntity<Collaborator> auth(String cpf) {
		Collaborator response = collaboratorService.auth(cpf);
		return ResponseEntity.ok().body(response);
	}

}
