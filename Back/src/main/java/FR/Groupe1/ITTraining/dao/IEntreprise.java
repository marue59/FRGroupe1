package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.EntrepriseDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseDao extends JpaRepository<EntrepriseDo,Long> {
        }