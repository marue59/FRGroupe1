package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.ThemeDao;
import FR.Groupe1.ITTraining.entity.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {

    @Autowired
    private ThemeDao themeDao;

    public List<Theme> findAll() {
        return themeDao.findAll();
    }

    public <S extends Theme> S save(S entity) {
        return themeDao.save(entity);
    }

    public Optional<Theme> findById(Long aLong) {
        return themeDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        themeDao.deleteById(aLong);
    }
}
