package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.dao.IFormation;
import FR.Groupe1.ITTraining.entity.FormationDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/formations")
public class FormationController {

   /* @Autowired
    private FormationDo formationdo;*/

   @Autowired
    private IFormation formation;

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
   public Optional<FormationDo> findById(@PathVariable Long id){

        return this.formation.findById(id);
    }

}
