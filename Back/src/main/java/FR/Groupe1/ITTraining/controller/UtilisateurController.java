package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.Utilisateur;
import FR.Groupe1.ITTraining.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Classe controller de l'utilisateur
 */
@RestController
@RequestMapping("/utilisateurs")
@CrossOrigin()
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    /**
     * méthode permettant d'afficher tous les utilisatrurs en bdd
     * @return la lidte des utilisateurs
     */
    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAll() {
        return this.utilisateurService.findAll();
    }

    /**
     *
     * @param id l'id de l'utilisateur recherché
     * @return l'utilisateur recherché
     */
    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Utilisateur findById(@PathVariable long id){
        return this.utilisateurService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Utilisateur create(@RequestBody Utilisateur utilisateur){
        return this.utilisateurService.create(utilisateur);
    }

    /**
     * méthode permettant la mise à jour d'un utilisateur
     * @param utilisateur un utilisateur
     * @param id l'id d'un utilisateur
     * @return l'utilisateur modifié
     */
    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Utilisateur update(@RequestBody Utilisateur utilisateur, @PathVariable Long id){
        if (!id.equals(utilisateur.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais utilisateur à mettre à jour");
        }
        return this.utilisateurService.update(utilisateur);
    }

    /**
     * méthode permettant de supprimer un utilisateur
     * @param id l'id de l'utilisateur supprimé
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.utilisateurService.delete(id);
    }



}
