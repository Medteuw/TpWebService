package mr.una.TpRest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Etudiants")
public class Etudiant {
	
	
	@Id
	private long matricule;
	private String nom;
	private String specialite;
	
	public Etudiant(long matricule, String nom, String specialite) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.specialite = specialite;
	}

	public Etudiant() {
		super();
	}

	public long getMatricule() {
		return matricule;
	}

	public void setMatricule(long matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	

}
