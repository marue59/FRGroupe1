package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.TestDao;
import FR.Groupe1.ITTraining.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public List<Test> findAll(){
        return this.testDao.findAll();
    }

    public Test findById(Long id){
        Optional<Test> optionalTest =  this.testDao.findById(id);
        if(optionalTest.isPresent()){
            return optionalTest.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Test create(Test test){
        return this.testDao.save(test);
    }

    public Test update(Test test){
        if(!this.testDao.existsById(test.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour le test");
        }
        return this.testDao.save(test);
    }

    public void delete(Long id){
        if (!this.testDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.testDao.deleteById(id);
        if (this.testDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
