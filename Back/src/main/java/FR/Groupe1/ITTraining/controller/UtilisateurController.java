package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.Utilisateur;
import FR.Groupe1.ITTraining.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/utilisateurs")
@CrossOrigin()
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAll() {
        return this.utilisateurService.findAll();
    }

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

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Utilisateur update(@RequestBody Utilisateur utilisateur, @PathVariable Long id){
        if (!id.equals(utilisateur.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais utilisateur à mettre à jour");
        }
        return this.utilisateurService.update(utilisateur);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.utilisateurService.delete(id);
    }



}
