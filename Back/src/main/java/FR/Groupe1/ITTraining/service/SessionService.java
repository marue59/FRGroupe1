package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.SessionDao;
import FR.Groupe1.ITTraining.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {

    @Autowired
    private SessionDao sessionDao;

    public List<Session> findAll() {
        return sessionDao.findAll();
    }

    public <S extends Session> S save(S entity) {
        return sessionDao.save(entity);
    }

    public Optional<Session> findById(Long aLong) {
        return sessionDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        sessionDao.deleteById(aLong);
    }
}
