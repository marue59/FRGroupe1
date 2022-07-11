package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Test;
import FR.Groupe1.ITTraining.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/tests")
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Test> findAll(){
        return this.testService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Test findById(@PathVariable long id){
        return this.testService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Test create(@RequestBody Test test){
        return this.testService.create(test);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Test update(@RequestBody Test test, @PathVariable Long id){
        if (!id.equals(test.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais test à mettre à jour");
        }
        return this.testService.update(test);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.testService.delete(id);
    }



}
