package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.dao.IFormation;
import FR.Groupe1.ITTraining.entity.FormationDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IFormation formation;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<FormationDo> findAll(){
        return this.formation.findAll();
    }
}
