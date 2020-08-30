package mr.una.TpRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.una.TpRest.Entity.Etudiant;

public interface EtudiantRepository extends  JpaRepository<Etudiant, Long>{

}
