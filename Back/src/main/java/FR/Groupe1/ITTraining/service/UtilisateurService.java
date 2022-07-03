package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.UtilisateurDao;
import FR.Groupe1.ITTraining.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurDao utilisateurDao;

    public List<Utilisateur> findAll() {
        return utilisateurDao.findAll();
    }

    public <S extends Utilisateur> S save(S entity) {
        return utilisateurDao.save(entity);
    }

    public Optional<Utilisateur> findById(Long aLong) {
        return utilisateurDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        utilisateurDao.deleteById(aLong);
    }
}
