package FR.Groupe1.ITTraining.controller;


import FR.Groupe1.ITTraining.entity.Session;
import FR.Groupe1.ITTraining.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/sessions")
@CrossOrigin(origins = "http://localhost:4200")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Session> findAll(){
        return this.sessionService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Session findById(@PathVariable long id){
        return this.sessionService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Session create(@RequestBody Session session){
        return this.sessionService.create(session);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Session update(@RequestBody Session session, @PathVariable Long id){
        if (!id.equals(session.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise session à mettre à jour");
        }
        return this.sessionService.update(session);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.sessionService.delete(id);
    }
}
