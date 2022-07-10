package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.SavDao;
import FR.Groupe1.ITTraining.entity.Sav;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class SavService {

    @Autowired
    private SavDao savDao;

    public List<Sav> findAll(){
        return this.savDao.findAll();
    }

    public Sav findById(Long id){
        Optional<Sav> optionalSav =  this.savDao.findById(id);
        if(optionalSav.isPresent()){
            return optionalSav.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Sav create(Sav sav){
        return this.savDao.save(sav);
    }

    public Sav update(Sav sav){
        if(!this.savDao.existsById(sav.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour le SAV");
        }
        return this.savDao.save(sav);
    }

    public void delete(Long id){
        if (!this.savDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.savDao.deleteById(id);
        if (this.savDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
