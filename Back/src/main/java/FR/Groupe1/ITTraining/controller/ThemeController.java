package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.Domaine;
import FR.Groupe1.ITTraining.entity.Theme;
import FR.Groupe1.ITTraining.service.DomaineService;
import FR.Groupe1.ITTraining.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/themes")
@CrossOrigin(origins = "http://localhost:4200")
public class ThemeController {

    @Autowired
    private ThemeService themeService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Theme> findAll(){
        return this.themeService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<Theme> findById(@PathVariable Long id){
        return this.themeService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Theme save(@RequestBody Theme theme){
        return this.themeService.save(theme);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void deleteById(@PathVariable Long id){
        this.themeService.deleteById(id);
    }


}
