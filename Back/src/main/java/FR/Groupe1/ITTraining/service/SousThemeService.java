package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.SousThemeDao;
import FR.Groupe1.ITTraining.entity.SousTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SousThemeService {

    @Autowired
    private SousThemeDao sousThemeDao;

    public List<SousTheme> findAll() {
        return sousThemeDao.findAll();
    }

    public <S extends SousTheme> S save(S entity) {
        return sousThemeDao.save(entity);
    }

    public Optional<SousTheme> findById(Long aLong) {
        return sousThemeDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        sousThemeDao.deleteById(aLong);
    }
}
