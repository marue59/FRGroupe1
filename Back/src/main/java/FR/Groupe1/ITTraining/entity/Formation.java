package FR.Groupe1.ITTraining.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "formation")
public class Formation {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "objectifs")
    private String objectifs;

    @Column(name = "programme")
    private String programme;

    @Column(name = "prix")
    private int prix;

    @Column(name = "heures")
    private int heures;

    @Column(name = "jours")
    private int jours;

    @Column(name = "is_personnalisee")
    private boolean isPersonnalisee;


    // Mapping vers la table avec la relation many to many

    @ManyToMany
    @JoinTable(name = "sous_theme_has_formation", joinColumns = @JoinColumn(name = "formation_id"), inverseJoinColumns = @JoinColumn(name = "sous_theme_id"))
    @JsonIgnore // Obligé pour éviter l'erreur sendError(). Les sous-thèmes sont ignorés dans les méthodes GET POST PUT, mais peuvent-être récupérés en passant par la table sous-thème.
    private Set<SousTheme> sousThemes;


    // Constructeurs
    public Formation() {
    }

    public Formation(Long id, String nom, String description, String objectifs, String programme, int prix, int heures, int jours, boolean isPersonnalisee, Set<SousTheme> sousThemes) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.objectifs = objectifs;
        this.programme = programme;
        this.prix = prix;
        this.heures = heures;
        this.jours = jours;
        this.isPersonnalisee = isPersonnalisee;
        this.sousThemes = sousThemes;
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


    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public boolean isPersonnalisee() {
        return isPersonnalisee;
    }

    public void setPersonnalisee(boolean personnalisee) {
        isPersonnalisee = personnalisee;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(String objectifs) {
        this.objectifs = objectifs;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getJours() {
        return jours;
    }

    public void setJours(int jours) {
        this.jours = jours;
    }

    public Set<SousTheme> getSousThemes() {
        return sousThemes;
    }

    public void setSousThemes(Set<SousTheme> sousThemes) {
        this.sousThemes = sousThemes;
    }








    // Méthodes

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Formation{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", objectifs='").append(objectifs).append('\'');
        sb.append(", programme='").append(programme).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", heures=").append(heures);
        sb.append(", jours=").append(jours);
        sb.append(", isPersonnalisee=").append(isPersonnalisee);
        sb.append('}');
        return sb.toString();
    }
}