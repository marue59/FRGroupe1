package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.SousThemeDao;
import FR.Groupe1.ITTraining.entity.SousTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class SousThemeService {

    @Autowired
    private SousThemeDao sousThemeDao;

    public List<SousTheme> findAll(){
        return this.sousThemeDao.findAll();
    }

    public SousTheme findById(Long id){
        Optional<SousTheme> optionalSousTheme =  this.sousThemeDao.findById(id);
        if(optionalSousTheme.isPresent()){
            return optionalSousTheme.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public SousTheme create(SousTheme sousTheme){
        return this.sousThemeDao.save(sousTheme);
    }

    public SousTheme update(SousTheme sousTheme){
        if(!this.sousThemeDao.existsById(sousTheme.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour le sous-theme");
        }
        return this.sousThemeDao.save(sousTheme);
    }

    public void delete(Long id){
        if (!this.sousThemeDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.sousThemeDao.deleteById(id);
        if (this.sousThemeDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}