package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Sav;
import FR.Groupe1.ITTraining.service.SavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/savs")
@CrossOrigin(origins = "http://localhost:4200")
public class SavController {

    @Autowired
    private SavService savService;


    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Sav> findAll(){
        return this.savService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Sav findById(@PathVariable long id){
        return this.savService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Sav create(@RequestBody Sav sav){
        return this.savService.create(sav);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Sav update(@RequestBody Sav sav, @PathVariable Long id){
        if (!id.equals(sav.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais SAV à mettre à jour");
        }
        return this.savService.update(sav);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.savService.delete(id);
    }


}
