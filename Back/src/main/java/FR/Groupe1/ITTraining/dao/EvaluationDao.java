package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationDao extends JpaRepository<Evaluation, Long> {
}