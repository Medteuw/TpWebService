package mr.una.TpRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mr.una.TpRest.Entity.Etudiant;
import mr.una.TpRest.Repository.EtudiantRepository;

@SpringBootApplication
public class TpRestApplication implements CommandLineRunner {
	
	
	@Autowired
	private EtudiantRepository etudiantRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpRestApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		etudiantRepository.save(new Etudiant(2,"Cheikh mohamed","Informatique"));
		etudiantRepository.save(new Etudiant(1,"Medteuw","Informatique"));
		etudiantRepository.save(new Etudiant(3,"Demba seck","Informatique"));
	}

}
