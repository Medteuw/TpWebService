package mr.una.TpRest.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mr.una.TpRest.Entity.Etudiant;
import mr.una.TpRest.Repository.EtudiantRepository;

@RestController()
public class EutdiantController {
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	//afficher tous les etudiants
	@GetMapping("/Etudiants")
	public List<Etudiant> listEtudiant(){
		return etudiantRepository.findAll();
				
	}
		
	// Dire bonjour a un etudiant
	@GetMapping("/Bonjour/{id}")
	public String DireBonjour(@PathVariable long id){
		Optional<Etudiant> etudiant = etudiantRepository.findById(id);
		String nom = etudiant.get().getNom();
		
		return "Bonjour "+ nom ;
	}
   
		
	//afficher un etudiant specifique
	@GetMapping("/Etudiants/{id}")
	public Optional<Etudiant> GetEtudiant(@PathVariable long id) {
		Optional<Etudiant> etudiant = etudiantRepository.findById(id);
				return etudiant;
		
	}
		
	@PostMapping("/Etudiants")
	public void AjouterEtudiant(@RequestBody Etudiant etudiant) {
		etudiantRepository.save(etudiant);
	}
		
	//Supprimer un etudiant specifique
	@DeleteMapping("/Etudiants/{id}")
	public void  DeleteEtudiant(@PathVariable long id){
		etudiantRepository.deleteById(id);
		}
}
