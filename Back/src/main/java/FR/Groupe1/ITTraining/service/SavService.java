package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.SavDao;
import FR.Groupe1.ITTraining.entity.Sav;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SavService {

    @Autowired
    private SavDao savDao;

    public List<Sav> findAll() {
        return savDao.findAll();
    }

    public <S extends Sav> S save(S entity) {
        return savDao.save(entity);
    }

    public Optional<Sav> findById(Long aLong) {
        return savDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        savDao.deleteById(aLong);
    }
}
