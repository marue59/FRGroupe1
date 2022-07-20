package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.FormationDao;
import FR.Groupe1.ITTraining.entity.Formation;
import FR.Groupe1.ITTraining.entity.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    @Autowired
    private FormationDao formationDao;

    public List<Formation> findAll(){
        return this.formationDao.findAll();
    }

    public Formation findById(Long id){
        Optional<Formation> optionalFormation =  this.formationDao.findById(id);
        if(optionalFormation.isPresent()){
            return optionalFormation.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Formation create(Formation formation){
        return this.formationDao.save(formation);
    }

    public Formation update(Formation formation){
        if(!this.formationDao.existsById(formation.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour la formation");
        }
        return this.formationDao.save(formation);
    }

    public void delete(Long id){
        if (!this.formationDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.formationDao.deleteById(id);
        if (this.formationDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
