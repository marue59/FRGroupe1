package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDao extends JpaRepository<Session, Long> {

}