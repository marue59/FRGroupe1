package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.ThemeDao;
import FR.Groupe1.ITTraining.entity.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {

    @Autowired
    private ThemeDao themeDao;

    public List<Theme> findAll(){
        return this.themeDao.findAll();
    }

    public Theme findById(Long id){
        Optional<Theme> optionalTheme =  this.themeDao.findById(id);
        if(optionalTheme.isPresent()){
            return optionalTheme.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Theme create(Theme theme){
        return this.themeDao.save(theme);
    }

    public Theme update(Theme theme){
        if(!this.themeDao.existsById(theme.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour le theme");
        }
        return this.themeDao.save(theme);
    }

    public void delete(Long id){
        if (!this.themeDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.themeDao.deleteById(id);
        if (this.themeDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
