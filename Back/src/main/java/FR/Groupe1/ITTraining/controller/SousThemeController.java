package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.SousTheme;
import FR.Groupe1.ITTraining.service.SousThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/sous-themes")
@CrossOrigin(origins = "http://localhost:4200")
public class SousThemeController {


    @Autowired
    private SousThemeService sousThemeService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<SousTheme> findAll() {
        return this.sousThemeService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public SousTheme findById(@PathVariable long id) {
        return this.sousThemeService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public SousTheme create(@RequestBody SousTheme sousTheme) {
        return this.sousThemeService.create(sousTheme);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public SousTheme update(@RequestBody SousTheme sousTheme, @PathVariable Long id) {
        if (!id.equals(sousTheme.getId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvais sous-theme à mettre à jour");
        }
        return this.sousThemeService.update(sousTheme);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id) {
        this.sousThemeService.delete(id);
    }
}