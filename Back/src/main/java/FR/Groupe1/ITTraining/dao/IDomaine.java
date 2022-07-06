package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.DomaineDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomaineDao extends JpaRepository<DomaineDo, Long> {
}