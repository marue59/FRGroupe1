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

    @Column(name = "contenu")
    private String contenu;

    public Theme() {
        super();
    }

    public Theme(Long id, String nom, String contenu) {
        this.id = id;
        this.nom = nom;
        this.contenu = contenu;
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

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", contenu='" + contenu + '\'' +
                '}';
    }
}
