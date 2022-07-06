package FR.Groupe1.ITTraining.service;

import FR.Groupe1.ITTraining.dao.IFormation;
import FR.Groupe1.ITTraining.entity.FormationDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class FormationService {

    @Autowired
    private IFormation formationDao;

    public FormationDo findById(Long aLong) {
        return formationDao.findById(aLong).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
