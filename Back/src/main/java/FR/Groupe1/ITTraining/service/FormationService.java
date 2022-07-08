package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.FormationDao;
import FR.Groupe1.ITTraining.entity.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    @Autowired
    private FormationDao formationDao;

    public List<Formation> findAll() {
        return formationDao.findAll();
    }

    public <S extends Formation> S save(S entity) {
        return formationDao.save(entity);
    }

    public Optional<Formation> findById(Long aLong) {
        return formationDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        formationDao.deleteById(aLong);
    }
}
