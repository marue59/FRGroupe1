package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.TestDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITest extends JpaRepository<TestDo,Long> {
}