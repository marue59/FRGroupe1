package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.DomaineDao;
import FR.Groupe1.ITTraining.entity.Domaine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DomaineService {

    @Autowired
    private DomaineDao domaineDao;


    public List<Domaine> findAll(){
        return this.domaineDao.findAll();
    }

    public Domaine findById(Long id){
        Optional<Domaine> optionalDomaine =  this.domaineDao.findById(id);
        if(optionalDomaine.isPresent()){
            return optionalDomaine.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Domaine create(Domaine domaine){
        return this.domaineDao.save(domaine);
    }

    public Domaine update(Domaine domaine){
        if(!this.domaineDao.existsById(domaine.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour le domaine");
        }
        return this.domaineDao.save(domaine);
    }

    public void delete(Long id){
        if (!this.domaineDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.domaineDao.deleteById(id);
        if (this.domaineDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
