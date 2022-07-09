package FR.Groupe1.ITTraining.service;


import FR.Groupe1.ITTraining.dao.FormateurDao;
import FR.Groupe1.ITTraining.entity.Formateur;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class FormateurService {

        @Autowired
        private FormateurDao formateurDao;

    public List<Formateur> findAll() {
        return formateurDao.findAll();
    }

    public <S extends Formateur> S save(S entity) {
        return formateurDao.save(entity);
    }

    public Optional<Formateur> findById(Long aLong) {
        return formateurDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        formateurDao.deleteById(aLong);
    }
}
