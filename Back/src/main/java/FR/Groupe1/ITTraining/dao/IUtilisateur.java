package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.UtilisateurDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateur extends JpaRepository<UtilisateurDo, Long> {
}