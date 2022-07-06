package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.ServiceCommercialSavDao;
import FR.Groupe1.ITTraining.entity.ServiceCommercialeSav;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCommercialSavService {

    @Autowired
    private ServiceCommercialSavDao serviceCommercialSavDao;

    public List<ServiceCommercialeSav> findAll() {
        return serviceCommercialSavDao.findAll();
    }

    public <S extends ServiceCommercialeSav> S save(S entity) {
        return serviceCommercialSavDao.save(entity);
    }

    public Optional<ServiceCommercialeSav> findById(Long aLong) {
        return serviceCommercialSavDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        serviceCommercialSavDao.deleteById(aLong);
    }
}
