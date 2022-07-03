package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.Formation;
import FR.Groupe1.ITTraining.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Formation> findById(@PathVariable Long id){
        return this.formationService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Formation save(@RequestBody Formation formation){
        return this.formationService.save(formation);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void deleteById(@PathVariable Long id){
        this.formationService.deleteById(id);
    }






}
