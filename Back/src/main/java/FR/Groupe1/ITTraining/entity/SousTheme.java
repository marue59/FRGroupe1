package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "sous_theme")
public class SousTheme {
    @Id
    @Column(name = "idSousTheme")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom_sous_theme")
    private String nomSousTheme;

    public SousTheme() {
        super();
    }

    public SousTheme(Long id, String nomSousTheme) {
        this.id = id;
        this.nomSousTheme = nomSousTheme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomSousTheme() {
        return nomSousTheme;
    }

    public void setNomSousTheme(String nomSousTheme) {
        this.nomSousTheme = nomSousTheme;
    }

    @Override
    public String toString() {
        return "SousThemeDo{" +
                "id=" + id +
                ", nomSousTheme='" + nomSousTheme + '\'' +
                '}';
    }
}

