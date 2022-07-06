package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "theme")
public class Theme {

    @Id
    @Column(name = "idTheme")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    public Theme() {
        super();
    }

    public Theme(Long id, String nom) {
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "ThemeDo{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
