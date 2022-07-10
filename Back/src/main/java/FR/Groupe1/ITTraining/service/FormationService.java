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

    public Formation create(Formation formation) {
        return formationDao.save(formation);
    }

    public Formation  update(Formation formation) {
        return formationDao.save(formation);
    }

    public Optional<Formation> findById(Long aLong) {
        return formationDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        formationDao.deleteById(aLong);
    }
}
