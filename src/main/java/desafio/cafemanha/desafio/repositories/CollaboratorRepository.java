package desafio.cafemanha.desafio.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import desafio.cafemanha.desafio.models.Collaborator;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {
	
	@Modifying
	@Query(value = "INSERT into COLLABORATOR (cpf,name) VALUES (:cpf,:name)", nativeQuery = true)
	@Transactional
	void save(@Param("cpf") String cpf, @Param("name") String name); 
	
	@Query(value = "SELECT * from COLLABORATOR c where c.cpf= :cpf", nativeQuery = true)
	Collaborator verificarDuplicadeDeCpf(@Param("cpf") String cpf);
}
