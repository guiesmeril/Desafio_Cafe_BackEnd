package desafio.cafemanha.desafio.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description; 
	
	@Transient
	private Long idCollaborator;
	
	@OneToOne
	@JoinColumn(name = "id_collaborator")
	private Collaborator collaborator;
	 
	
	public Item () {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Long getIdCollaborator() {
		return idCollaborator;
	}


	public void setIdCollaborator(Long idCollaborator) {
		this.idCollaborator = idCollaborator;
	}


	public Collaborator getCollaborator() {
		return collaborator;
	}


	public void setCollaborator(Collaborator collaborator) {
		this.collaborator = collaborator;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ", idCollaborator=" + idCollaborator
				+ ", collaborator=" + collaborator + "]";
	}

	
 
	
	
}
