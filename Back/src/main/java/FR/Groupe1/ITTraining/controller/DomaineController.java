package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.Domaine;
import FR.Groupe1.ITTraining.service.DomaineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/domaines")
@CrossOrigin(origins = "http://localhost:4200")
public class DomaineController {

    @Autowired
    private DomaineService domaineService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Domaine> findAll(){
        return this.domaineService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Domaine findById(@PathVariable long id){
        return this.domaineService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Domaine create(@RequestBody Domaine domaine){
        return this.domaineService.create(domaine);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Domaine update(@RequestBody Domaine domaine, @PathVariable Long id){
        if (!id.equals(domaine.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais domaine à mettre à jour");
        }
        return this.domaineService.update(domaine);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.domaineService.delete(id);
    }
}
