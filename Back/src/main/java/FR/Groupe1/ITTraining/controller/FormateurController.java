package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Formateur;
import FR.Groupe1.ITTraining.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/formateurs")
@CrossOrigin(origins = "http://localhost:4200")
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Formateur> findAll(){
        return this.formateurService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Formateur findById(@PathVariable long id){
        return this.formateurService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Formateur create(@RequestBody Formateur formateur){
        return this.formateurService.create(formateur);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Formateur update(@RequestBody Formateur formateur, @PathVariable Long id){
        if (!id.equals(formateur.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais formateur à mettre à jour");
        }
        return this.formateurService.update(formateur);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.formateurService.delete(id);
    }


}
