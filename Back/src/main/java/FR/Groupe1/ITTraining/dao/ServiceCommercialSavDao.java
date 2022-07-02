package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.ServiceCommercialeSavDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceCommercialSav extends JpaRepository<ServiceCommercialeSavDo, Long> {
}
