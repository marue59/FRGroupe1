package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Formation;
import FR.Groupe1.ITTraining.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/formations")
@CrossOrigin(origins = "http://localhost:4200")
public class FormationController {

    @Autowired
    private FormationService formationService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Formation> findAll(){
        return this.formationService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Formation findById(@PathVariable long id){
        return this.formationService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Formation create(@RequestBody Formation formation){
        return this.formationService.create(formation);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Formation update(@RequestBody Formation formation, @PathVariable Long id){
        if (!id.equals(formation.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise formation à mettre à jour");
        }
        return this.formationService.update(formation);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.formationService.delete(id);
    }






}
