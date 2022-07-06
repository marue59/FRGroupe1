package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.EvaluationSessionDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEvaluation extends JpaRepository<EvaluationSessionDo, Long> {
}