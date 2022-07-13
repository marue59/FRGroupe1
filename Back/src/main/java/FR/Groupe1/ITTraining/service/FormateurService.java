package FR.Groupe1.ITTraining.service;


import FR.Groupe1.ITTraining.dao.FormateurDao;
import FR.Groupe1.ITTraining.entity.Formateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class FormateurService {

        @Autowired
        private FormateurDao formateurDao;

    public List<Formateur> findAll(){
        return this.formateurDao.findAll();
    }

    public Formateur findById(Long id){
        Optional<Formateur> optionalFormateur =  this.formateurDao.findById(id);
        if(optionalFormateur.isPresent()){
            return optionalFormateur.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Formateur create(Formateur formateur){
        return this.formateurDao.save(formateur);
    }

    public Formateur update(Formateur formateur){
        if(!this.formateurDao.existsById(formateur.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour le formateur");
        }
        return this.formateurDao.save(formateur);
    }

    public void delete(Long id){
        if (!this.formateurDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.formateurDao.deleteById(id);
        if (this.formateurDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
