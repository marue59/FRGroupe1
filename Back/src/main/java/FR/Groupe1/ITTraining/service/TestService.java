package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.TestDao;
import FR.Groupe1.ITTraining.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public List<Test> findAll() {
        return testDao.findAll();
    }

    public <S extends Test> S save(S entity) {
        return testDao.save(entity);
    }

    public Optional<Test> findById(Long aLong) {
        return testDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        testDao.deleteById(aLong);
    }
}
