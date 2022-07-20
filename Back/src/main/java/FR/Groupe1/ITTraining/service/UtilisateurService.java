package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.UtilisateurDao;
import FR.Groupe1.ITTraining.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurDao utilisateurDao;

    public List<Utilisateur> findAll(){
        return this.utilisateurDao.findAll();
    }

    public Utilisateur findById(Long id){
        Optional<Utilisateur> optionalUtilisateur =  this.utilisateurDao.findById(id);
        if(optionalUtilisateur.isPresent()){
            return optionalUtilisateur.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Utilisateur create(Utilisateur utilisateur){
        return this.utilisateurDao.save(utilisateur);
    }

    public Utilisateur update(Utilisateur utilisateur){
        if(!this.utilisateurDao.existsById(utilisateur.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour l'utilisateur");
        }
        return this.utilisateurDao.save(utilisateur);
    }

    public void delete(Long id){
        if (!this.utilisateurDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.utilisateurDao.deleteById(id);
        if (this.utilisateurDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
