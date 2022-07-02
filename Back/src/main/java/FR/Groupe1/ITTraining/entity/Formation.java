package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "formation")
public class FormationDo {

    @Id
    @Column(name = "idFormation")
    @GeneratedValue
    private Long id;

    @Column(name = "nom_formation")
    private String nom;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "prix")
    private int prix;

    @Column(name = "formation_personnalisee")
    private boolean isPersonnalisee;

    // Construct
    public FormationDo() {
    }

    public FormationDo(String nom, String contenu, int prix, boolean isPersonnalisee) {
        this.nom = nom;
        this.contenu = contenu;
        this.prix = prix;
        this.isPersonnalisee = isPersonnalisee;
    }

    public FormationDo(Long id, String nom, String contenu, int prix, boolean isPersonnalisee) {
        this.id = id;
        this.nom = nom;
        this.contenu = contenu;
        this.prix = prix;
        this.isPersonnalisee = isPersonnalisee;
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

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FormationDO{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", contenu='").append(contenu).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", isPersonnalisee=").append(isPersonnalisee);
        sb.append('}');
        return sb.toString();
    }

}