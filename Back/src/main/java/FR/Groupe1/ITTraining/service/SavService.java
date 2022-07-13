package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.SavDao;
import FR.Groupe1.ITTraining.entity.ServiceCommercialeSav;
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

    public List<ServiceCommercialeSav> findAll(){
        return this.savDao.findAll();
    }

    public ServiceCommercialeSav findById(Long id){
        Optional<ServiceCommercialeSav> optionalSav =  this.savDao.findById(id);
        if(optionalSav.isPresent()){
            return optionalSav.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public ServiceCommercialeSav create(ServiceCommercialeSav sav){
        return this.savDao.save(sav);
    }

    public ServiceCommercialeSav update(ServiceCommercialeSav sav){
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
