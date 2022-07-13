package FR.Groupe1.ITTraining.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "sous_theme")
public class SousTheme {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    // Clé étrangère
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "theme_id",referencedColumnName = "id")
    private Theme theme;

    // Table pour une relation many to many

    @ManyToMany
    @JoinTable(name = "sous_theme_has_formation", joinColumns = @JoinColumn(name = "sous_theme_id"), inverseJoinColumns = @JoinColumn(name = "formation_id"))
    private Set<Formation> formations;


    // Constructeurs

    public SousTheme() {
        super();
    }

    public SousTheme(Long id, String nom, Theme theme, Set<Formation> formations) {
        this.id = id;
        this.nom = nom;
        this.theme = theme;
        this.formations = formations;
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

    public void setNom(String nomSousTheme) {
        this.nom = nomSousTheme;
    }


    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Set<Formation> getFormations() {
        return formations;
    }

    public void setFormations(Set<Formation> formations) {
        this.formations = formations;
    }


    // Méthodes

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SousTheme{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", theme=").append(theme);
        sb.append('}');
        return sb.toString();
    }
}

