package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.LogistiqueDao;
import FR.Groupe1.ITTraining.entity.Logistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogistiqueService {

    @Autowired
    private LogistiqueDao logistiqueDao;

    public List<Logistique> findAll() {
        return logistiqueDao.findAll();
    }

    public <S extends Logistique> S save(S entity) {
        return logistiqueDao.save(entity);
    }

    public Optional<Logistique> findById(Long aLong) {
        return logistiqueDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        logistiqueDao.deleteById(aLong);
    }
}
