package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "sous_theme")
public class SousTheme {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    public SousTheme() {
        super();
    }

    public SousTheme(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nomSousTheme) {
        this.nom = nomSousTheme;
    }

    @Override
    public String toString() {
        return "SousThemeDo{" +
                "id=" + id +
                ", nomSousTheme='" + nom + '\'' +
                '}';
    }
}

