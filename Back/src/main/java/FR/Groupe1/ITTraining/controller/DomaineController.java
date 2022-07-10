package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.Domaine;
import FR.Groupe1.ITTraining.entity.Formation;
import FR.Groupe1.ITTraining.service.DomaineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Domaine> findById(@PathVariable Long id){
        return this.domaineService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Domaine create(@RequestBody Domaine domaine){
        return this.domaineService.save(domaine);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Domaine update(@RequestBody Domaine domaine, @PathVariable Long id){
        return this.domaineService.save(domaine);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void deleteById(@PathVariable Long id){
        this.domaineService.deleteById(id);
    }
}
