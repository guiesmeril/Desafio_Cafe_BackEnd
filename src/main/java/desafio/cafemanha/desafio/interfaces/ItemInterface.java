package desafio.cafemanha.desafio.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import desafio.cafemanha.desafio.models.Item;

@RequestMapping("/items")
public interface ItemInterface {

	@PostMapping
	public ResponseEntity<Item> inserir(@RequestBody Item item);
	
	@GetMapping
	public ResponseEntity<List<Item>> findAll();
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable(required = true) Long id);
}
