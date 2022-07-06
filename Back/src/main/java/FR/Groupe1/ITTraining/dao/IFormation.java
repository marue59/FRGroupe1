package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.FormationDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationDao extends JpaRepository<FormationDo, Long> {


}