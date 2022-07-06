package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface FormationDao extends JpaRepository<Formation, Long> {
}