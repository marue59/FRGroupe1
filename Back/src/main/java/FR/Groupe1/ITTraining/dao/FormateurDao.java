package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormateurDao extends JpaRepository<Formateur, Long> {
}
