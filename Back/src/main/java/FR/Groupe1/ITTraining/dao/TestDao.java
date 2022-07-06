package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDao extends JpaRepository<Test,Long> {
}