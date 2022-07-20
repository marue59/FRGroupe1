package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Formation;
import FR.Groupe1.ITTraining.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Classe controller de formation
 */
@RestController
@RequestMapping("/formations")
@CrossOrigin(origins = "http://localhost:4200")
public class FormationController {

    @Autowired
    private FormationService formationService;
    /**
     * méthode permettant d'afficher toutes les formations
     * @return la liste des formations enregistrées
     */
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Formation> findAll(){
        return this.formationService.findAll();
    }

    /**
     *méthode permettant d'afficher la formation selon son id
     * @param id l'id de la formation
     * @return la formation voulue
     */
    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Formation findById(@PathVariable long id){
        return this.formationService.findById(id);
    }

    /**
     *méthode permettant la création d'une formation
     * @param formation une formation
     * @return la formation
     */
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Formation create(@RequestBody Formation formation){
        return this.formationService.create(formation);
    }

    /**
     * méthode permettant la modification d'une formation
     * @param formation la formation à modifier
     * @param id l'id de la formation à modifier
     * @return la formation modifiée
     */
    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Formation update(@RequestBody Formation formation, @PathVariable Long id){
        if (!id.equals(formation.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise formation à mettre à jour");
        }
        return this.formationService.update(formation);
    }

    /**
     * méthode permettant la suppression d'une formation
     * @param id l'id de la formation à supprimer
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.formationService.delete(id);
    }






}
