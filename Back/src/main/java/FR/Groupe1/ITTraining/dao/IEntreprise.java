package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.EntrepriseDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEntreprise extends JpaRepository<EntrepriseDo,Long> {
        }