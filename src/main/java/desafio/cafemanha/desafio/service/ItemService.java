package desafio.cafemanha.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.cafemanha.desafio.models.Collaborator;
import desafio.cafemanha.desafio.models.Item;
import desafio.cafemanha.desafio.repositories.ItemRepository;
import desafio.cafemanha.desafio.rn.RegraNegocio;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private RegraNegocio negocio;
	
	public Item inserir(Item request) {  
		
		negocio.checkItemExistence(request.getDescription());
		
		Item item = new Item();
		Collaborator collaborator = new Collaborator(); 
		collaborator.setId(request.getIdCollaborator()); 
		item.setDescription(request.getDescription()); 
		item.setCollaborator(collaborator);
		itemRepository.save(item); 
		return item;
	}
	
	public List<Item> findAll() {
		List<Item> listItem = itemRepository.findAll();
		return listItem;
	}
	
	public void delete (Long id) {
		itemRepository.deleteItem(id);
	}

}
