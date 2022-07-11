package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Evaluation;
import FR.Groupe1.ITTraining.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/evaluations")
@CrossOrigin(origins = "http://localhost:4200")
public class EvaluationController {

    @Autowired
    private EvaluationService evaluationService;


    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Evaluation> findAll(){
        return this.evaluationService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Evaluation findById(@PathVariable long id){
        return this.evaluationService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Evaluation create(@RequestBody Evaluation evaluation){
        return this.evaluationService.create(evaluation);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Evaluation update(@RequestBody Evaluation evaluation, @PathVariable Long id){
        if (!id.equals(evaluation.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise évaluation à mettre à jour");
        }
        return this.evaluationService.update(evaluation);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.evaluationService.delete(id);
    }
}
