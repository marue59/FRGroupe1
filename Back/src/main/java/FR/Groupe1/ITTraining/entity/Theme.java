package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "theme")
public class Theme {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;


    public Theme() {
    }

    public Theme(Long id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "ThemeDo{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
