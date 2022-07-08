package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
}
