package FR.Groupe1.ITTraining.controller;

import FR.Groupe1.ITTraining.entity.SousTheme;
import FR.Groupe1.ITTraining.entity.Theme;
import FR.Groupe1.ITTraining.service.SousThemeService;
import FR.Groupe1.ITTraining.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sous_theme")
@CrossOrigin(origins = "http://localhost:4200")
public class SousThemeController {


    @Autowired
    private SousThemeService sousThemeService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<SousTheme> findAll(){
        return this.sousThemeService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<SousTheme> findById(@PathVariable Long id){
        return this.sousThemeService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public SousTheme save(@RequestBody SousTheme sousTheme){
        return this.sousThemeService.save(sousTheme);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void deleteById(@PathVariable Long id){
        this.sousThemeService.deleteById(id);
    }




}
