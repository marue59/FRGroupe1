package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Theme;
import FR.Groupe1.ITTraining.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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
    public Theme findById(@PathVariable long id){
        return this.themeService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Theme create(@RequestBody Theme theme){
        return this.themeService.create(theme);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Theme update(@RequestBody Theme theme, @PathVariable Long id){
        if (!id.equals(theme.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais theme à mettre à jour");
        }
        return this.themeService.update(theme);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.themeService.delete(id);
    }


}