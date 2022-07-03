package FR.Groupe1.ITTraining.dao;

import FR.Groupe1.ITTraining.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeDao extends JpaRepository<Theme, Long> {
}