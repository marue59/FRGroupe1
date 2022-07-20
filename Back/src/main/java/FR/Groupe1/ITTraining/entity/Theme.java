package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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


    // Clé étrangère
    @OneToMany(mappedBy = "theme")
    @Column(name = "sous-themes")
    private List<SousTheme> sousThemesList = new ArrayList<>();

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "domaine_id", referencedColumnName = "id")
    private Domaine domaine;


    // Constructeurs

    public Theme() {
    }

    public Theme(Long id, String nom, String description, List<SousTheme> sousThemesList, Domaine domaine) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.sousThemesList = sousThemesList;
        this.domaine = domaine;
    }

    // Getters & Setters
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

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public List<SousTheme> getSousThemesList() {
        return sousThemesList;
    }

    public void setSousThemesList(List<SousTheme> sousThemesList) {
        this.sousThemesList = sousThemesList;
    }

    // Méthodes
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Theme{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", domaine=").append(domaine);
        sb.append('}');
        return sb.toString();
    }
}
