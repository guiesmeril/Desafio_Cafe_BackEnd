package desafio.cafemanha.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import desafio.cafemanha.desafio.models.Item;

@Repository
public interface ItemRepository  extends JpaRepository<Item, Long> {
	@Modifying
	@Query(value = "INSERT into ITEM (description,id_collaborator) VALUES (:description,:id_collaborator)", nativeQuery = true)
	@Transactional
	void save(@Param("description") String description, @Param("id_collaborator") String id_collaborator); 
	
	@Modifying
	@Query(value = "DELETE From ITEM WHERE ID = :id ", nativeQuery = true)
	@Transactional
	void deleteItem(@Param("id") Long id);
	
	@Query(value = "SELECT * from ITEM c where c.description= :description", nativeQuery = true)
	Item verificarDuplicadeDeItem(@Param("description") String description);
}
