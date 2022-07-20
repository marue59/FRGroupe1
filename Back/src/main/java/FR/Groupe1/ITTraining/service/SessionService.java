package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.SessionDao;
import FR.Groupe1.ITTraining.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {

    @Autowired
    private SessionDao sessionDao;

    public List<Session> findAll(){
        return this.sessionDao.findAll();
    }

    public Session findById(Long id){
        Optional<Session> optionalSession =  this.sessionDao.findById(id);
        if(optionalSession.isPresent()){
            return optionalSession.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Session create(Session session){
        return this.sessionDao.save(session);
    }

    public Session update(Session session){
        if(!this.sessionDao.existsById(session.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour la session");
        }
        return this.sessionDao.save(session);
    }

    public void delete(Long id){
        if (!this.sessionDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.sessionDao.deleteById(id);
        if (this.sessionDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
