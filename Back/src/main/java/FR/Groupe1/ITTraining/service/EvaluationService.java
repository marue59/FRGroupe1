package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.EvaluationDao;
import FR.Groupe1.ITTraining.entity.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluationService {

    @Autowired
    private EvaluationDao evaluationDao;

    public List<Evaluation> findAll() {
        return evaluationDao.findAll();
    }

    public <S extends Evaluation> S save(S entity) {
        return evaluationDao.save(entity);
    }

    public Optional<Evaluation> findById(Long aLong) {
        return evaluationDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        evaluationDao.deleteById(aLong);
    }
}
