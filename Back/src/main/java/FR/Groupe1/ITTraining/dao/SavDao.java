package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.ServiceCommercialeSav;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavDao extends JpaRepository<ServiceCommercialeSav, Long> {
}
