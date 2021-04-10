package desafio.cafemanha.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.cafemanha.desafio.models.Collaborator;
import desafio.cafemanha.desafio.repositories.CollaboratorRepository;
import desafio.cafemanha.desafio.rn.RegraNegocio;

@Service
public class CollaboratorService {

	@Autowired
	private CollaboratorRepository collaboratorRepository;

	@Autowired
	private RegraNegocio regraNegocio;

	public Collaborator auth(String  cpf) {
	Collaborator collaborator =	collaboratorRepository.verificarDuplicadeDeCpf(cpf);
		
		return collaborator;
	}
	
	public Collaborator inserir(Collaborator request) {

		regraNegocio.checkTheEmployeesExistence(request.getCpf());

		Collaborator collaborator = new Collaborator();
		collaborator.setCpf(request.getCpf());
		collaborator.setName(request.getName());
		collaboratorRepository.save(collaborator);

		return collaborator;
	}

	public Void delete(Long id) {

		return null;
	}

	public Collaborator update(Collaborator collaborator) {

		return null;
	}

	public List<Collaborator> getCollaborator() {

		return null;
	}

}
