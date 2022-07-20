package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.LogistiqueDao;
import FR.Groupe1.ITTraining.entity.Logistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class LogistiqueService {

    @Autowired
    private LogistiqueDao logistiqueDao;

    public List<Logistique> findAll(){
        return this.logistiqueDao.findAll();
    }

    public Logistique findById(Long id){
        Optional<Logistique> optionalLogistique =  this.logistiqueDao.findById(id);
        if(optionalLogistique.isPresent()){
            return optionalLogistique.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Logistique create(Logistique logistique){
        return this.logistiqueDao.save(logistique);
    }

    public Logistique update(Logistique logistique){
        if(!this.logistiqueDao.existsById(logistique.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour la logistique");
        }
        return this.logistiqueDao.save(logistique);
    }

    public void delete(Long id){
        if (!this.logistiqueDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.logistiqueDao.deleteById(id);
        if (this.logistiqueDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
