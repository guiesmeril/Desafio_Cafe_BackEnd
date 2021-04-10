package desafio.cafemanha.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import desafio.cafemanha.desafio.interfaces.ItemInterface;
import desafio.cafemanha.desafio.models.Item;
import desafio.cafemanha.desafio.service.ItemService;

@RestController
public class ItemController implements ItemInterface {

	@Autowired
	private ItemService itemService;
	
	@Override
	public ResponseEntity<Item> inserir(Item item) {
		Item response = itemService.inserir(item);
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<List<Item>> findAll() {
		 List<Item> response = itemService.findAll();
		 
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		itemService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
