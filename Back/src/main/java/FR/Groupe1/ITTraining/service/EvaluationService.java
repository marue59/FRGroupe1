package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.EvaluationDao;
import FR.Groupe1.ITTraining.entity.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluationService {

    @Autowired
    private EvaluationDao evaluationDao;

    public List<Evaluation> findAll(){
        return this.evaluationDao.findAll();
    }

    public Evaluation findById(Long id){
        Optional<Evaluation> optionalEvaluation =  this.evaluationDao.findById(id);
        if(optionalEvaluation.isPresent()){
            return optionalEvaluation.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Evaluation create(Evaluation evaluation){
        return this.evaluationDao.save(evaluation);
    }

    public Evaluation update(Evaluation evaluation){
        if(!this.evaluationDao.existsById(evaluation.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour l'évaluation");
        }
        return this.evaluationDao.save(evaluation);
    }

    public void delete(Long id){
        if (!this.evaluationDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.evaluationDao.deleteById(id);
        if (this.evaluationDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
