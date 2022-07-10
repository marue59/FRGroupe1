package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Logistique;
import FR.Groupe1.ITTraining.service.LogistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/logistiques")
@CrossOrigin(origins = "http://localhost:4200")
public class LogistiqueController {


    @Autowired
    private LogistiqueService logistiqueService;



    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Logistique> findAll(){
        return this.logistiqueService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Logistique findById(@PathVariable long id){
        return this.logistiqueService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Logistique create(@RequestBody Logistique logistique){
        return this.logistiqueService.create(logistique);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Logistique update(@RequestBody Logistique logistique, @PathVariable Long id){
        if (!id.equals(logistique.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise logistique à mettre à jour");
        }
        return this.logistiqueService.update(logistique);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.logistiqueService.delete(id);
    }
}
