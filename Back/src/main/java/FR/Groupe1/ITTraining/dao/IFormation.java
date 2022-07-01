package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.FormationDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IFormation extends JpaRepository<FormationDo, Long> {


}