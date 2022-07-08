package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseDao extends JpaRepository<Entreprise,Long> {
        }