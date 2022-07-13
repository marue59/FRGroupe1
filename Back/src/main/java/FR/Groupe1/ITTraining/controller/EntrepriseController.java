package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Entreprise;
import FR.Groupe1.ITTraining.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/entreprises")
@CrossOrigin(origins = "http://localhost:4200")
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Entreprise> findAll(){
        return this.entrepriseService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Entreprise findById(@PathVariable long id){
        return this.entrepriseService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Entreprise create(@RequestBody Entreprise entreprise){
        return this.entrepriseService.create(entreprise);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Entreprise update(@RequestBody Entreprise entreprise, @PathVariable Long id){
        if (!id.equals(entreprise.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise entreprise à mettre à jour");
        }
        return this.entrepriseService.update(entreprise);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.entrepriseService.delete(id);
    }

}
