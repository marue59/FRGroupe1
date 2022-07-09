package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "domaine")
public class Domaine {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    // Construct
    public Domaine(){
        super();
    }

    public Domaine(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getter Setter
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

    // Methodes :

    @Override
    public String toString() {
        return "Domaine{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
