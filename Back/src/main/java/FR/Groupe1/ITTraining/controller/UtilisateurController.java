package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.Utilisateur;
import FR.Groupe1.ITTraining.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilisateurs")
@CrossOrigin()
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return this.utilisateurService.save(utilisateur);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void deleteById(@PathVariable Long id) {
        this.utilisateurService.deleteById(id);
    }

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAll() {
        return this.utilisateurService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<Utilisateur> findById(@PathVariable Long id) {
        return this.utilisateurService.findById(id);
    }

}
