package FR.Groupe1.ITTraining.dao;


import FR.Groupe1.ITTraining.entity.SousThemeDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISousTheme extends JpaRepository<SousThemeDo,Long> {
}