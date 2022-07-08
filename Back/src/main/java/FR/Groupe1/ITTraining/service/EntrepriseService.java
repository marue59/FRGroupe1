package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.EntrepriseDao;
import FR.Groupe1.ITTraining.entity.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseDao entrepriseDao;

    public List<Entreprise> findAll() {
        return entrepriseDao.findAll();
    }

    public <S extends Entreprise> S save(S entity) {
        return entrepriseDao.save(entity);
    }

    public Optional<Entreprise> findById(Long aLong) {
        return entrepriseDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        entrepriseDao.deleteById(aLong);
    }
}
