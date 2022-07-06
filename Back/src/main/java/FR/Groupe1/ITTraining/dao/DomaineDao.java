package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Domaine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomaineDao extends JpaRepository<Domaine, Long> {
}