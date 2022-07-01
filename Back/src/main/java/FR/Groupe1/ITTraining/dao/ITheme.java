package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.ThemeDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITheme extends JpaRepository<ThemeDo, Long> {
}