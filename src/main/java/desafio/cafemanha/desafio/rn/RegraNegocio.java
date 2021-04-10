package desafio.cafemanha.desafio.rn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.cafemanha.desafio.exceptions.ExceptionCpfAlreadyRegistered;
import desafio.cafemanha.desafio.exceptions.ExceptionItemAlreadyRegistered;
import desafio.cafemanha.desafio.models.Collaborator;
import desafio.cafemanha.desafio.models.Item;
import desafio.cafemanha.desafio.repositories.CollaboratorRepository;
import desafio.cafemanha.desafio.repositories.ItemRepository;

@Service
public class RegraNegocio {

	@Autowired
	private CollaboratorRepository collaboratorRepository;
	
	@Autowired 
	private ItemRepository itemRepository;

	public void checkTheEmployeesExistence(String cpf) {
		Collaborator collaborator = collaboratorRepository.verificarDuplicadeDeCpf(cpf);

		if (collaborator != null) {
			throw new ExceptionCpfAlreadyRegistered("CPF já está cadastrado");
		}
	}
	
	public void checkItemExistence(String description) {
		Item item = itemRepository.verificarDuplicadeDeItem(description);

		if (item != null) {
			throw new ExceptionItemAlreadyRegistered("Este item já está cadastrado");
		}
	}
}
