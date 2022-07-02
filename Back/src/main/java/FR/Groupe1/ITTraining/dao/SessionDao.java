package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.SessionDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISession extends JpaRepository<SessionDo, Long> {

}