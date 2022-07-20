package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.EntrepriseDao;
import FR.Groupe1.ITTraining.entity.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseDao entrepriseDao;

    public List<Entreprise> findAll(){
        return this.entrepriseDao.findAll();
    }

    public Entreprise findById(Long id){
        Optional<Entreprise> optionalEntreprise =  this.entrepriseDao.findById(id);
        if(optionalEntreprise.isPresent()){
            return optionalEntreprise.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Entreprise create(Entreprise entreprise){
        return this.entrepriseDao.save(entreprise);
    }

    public Entreprise update(Entreprise entreprise){
        if(!this.entrepriseDao.existsById(entreprise.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour l'entreprise");
        }
        return this.entrepriseDao.save(entreprise);
    }

    public void delete(Long id){
        if (!this.entrepriseDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.entrepriseDao.deleteById(id);
        if (this.entrepriseDao.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
