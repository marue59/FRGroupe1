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


    public List<Domaine> findAll() {
        return domaineDao.findAll();
    }

    public <S extends Domaine> S save(S entity) {
        return domaineDao.save(entity);
    }

    public Optional<Domaine> findById(Long aLong) {
        return domaineDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        domaineDao.deleteById(aLong);
    }
}
