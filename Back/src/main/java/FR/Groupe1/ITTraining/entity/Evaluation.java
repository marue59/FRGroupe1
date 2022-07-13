package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "evaluation")
public class Evaluation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "qualite_accueil")
    private Integer qualiteAccueil;
    @Column(name = "qualite_environnement")
    private Integer qualiteEnvironnement;
    @Column(name = "qualite_stage")
    private Integer qualiteStage;
    @Column(name = "date")
    private Date date;
    @Column(name = "pedagogie_formateur")
    private Integer pedagogieFormateur;

    @Column(name = "maitrise_formateur")
    private Integer maitriseFormateur;
    @Column(name = "disponibilite_formateur")
    private Integer disponibiliteFormateur;

    @Column(name = "reponse_formateur")
    private Integer reponseFormateur;

    @Column(name = "animation_formateur")
    private Integer animationFormateur;

    @Column(name = "satisfaction_utilisateur")
    private Integer satisfactionUtilisateur;

    @Column(name = "autre_projet")
    private Integer autreProjet;

    @Column(name = "moyenne_note")
    private Double moyenneNote;









    // Clé étrangère

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "sav_id", referencedColumnName = "id")
    private Sav sav;







    // Constructeurs

    public Evaluation() {
        super();
    }

    public Evaluation(Long id, Integer qualiteAccueil, Integer qualiteEnvironnement, Integer qualiteStage, Date date,
                      Integer pedagogieFormateur, Integer maitriseFormateur, Integer disponibiliteFormateur,
                      Integer reponseFormateur, Integer animationFormateur, Integer satisfactionUtilisateur,
                      Integer autreProjet, Double moyenneNote, Sav sav) {
        this.id = id;
        this.qualiteAccueil = qualiteAccueil;
        this.qualiteEnvironnement = qualiteEnvironnement;
        this.qualiteStage = qualiteStage;
        this.date = date;
        this.pedagogieFormateur = pedagogieFormateur;
        this.maitriseFormateur = maitriseFormateur;
        this.disponibiliteFormateur = disponibiliteFormateur;
        this.reponseFormateur = reponseFormateur;
        this.animationFormateur = animationFormateur;
        this.satisfactionUtilisateur = satisfactionUtilisateur;
        this.autreProjet = autreProjet;
        this.moyenneNote = moyenneNote;
        this.sav = sav;
    }










    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQualiteAccueil() {
        return qualiteAccueil;
    }

    public void setQualiteAccueil(Integer qualiteAccueil) {
        this.qualiteAccueil = qualiteAccueil;
    }

    public Integer getQualiteEnvironnement() {
        return qualiteEnvironnement;
    }

    public void setQualiteEnvironnement(Integer qualiteEnvironnement) {
        this.qualiteEnvironnement = qualiteEnvironnement;
    }

    public Integer getQualiteStage() {
        return qualiteStage;
    }

    public void setQualiteStage(Integer qualiteStage) {
        this.qualiteStage = qualiteStage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPedagogieFormateur() {
        return pedagogieFormateur;
    }

    public void setPedagogieFormateur(Integer pedagogieFormateur) {
        this.pedagogieFormateur = pedagogieFormateur;
    }

    public Integer getMaitriseFormateur() {
        return maitriseFormateur;
    }

    public void setMaitriseFormateur(Integer maitriseFormateur) {
        this.maitriseFormateur = maitriseFormateur;
    }

    public Integer getDisponibiliteFormateur() {
        return disponibiliteFormateur;
    }

    public void setDisponibiliteFormateur(Integer disponibiliteFormateur) {
        this.disponibiliteFormateur = disponibiliteFormateur;
    }

    public Integer getReponseFormateur() {
        return reponseFormateur;
    }

    public void setReponseFormateur(Integer reponseFormateur) {
        this.reponseFormateur = reponseFormateur;
    }

    public Integer getAnimationFormateur() {
        return animationFormateur;
    }

    public void setAnimationFormateur(Integer animationFormateur) {
        this.animationFormateur = animationFormateur;
    }

    public Integer getSatisfactionUtilisateur() {
        return satisfactionUtilisateur;
    }

    public void setSatisfactionUtilisateur(Integer satisfactionUtilisateur) {
        this.satisfactionUtilisateur = satisfactionUtilisateur;
    }

    public Integer getAutreProjet() {
        return autreProjet;
    }

    public void setAutreProjet(Integer autreProjet) {
        this.autreProjet = autreProjet;
    }

    public Double getMoyenneNote() {
        return moyenneNote;
    }

    public void setMoyenneNote(Double moyenneNote) {
        this.moyenneNote = moyenneNote;
    }

    public Sav getSav() {
        return sav;
    }

    public void setSav(Sav sav) {
        this.sav = sav;
    }









    // Méthodes

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Evaluation{");
        sb.append("id=").append(id);
        sb.append(", qualiteAccueil=").append(qualiteAccueil);
        sb.append(", qualiteEnvironnement=").append(qualiteEnvironnement);
        sb.append(", qualiteStage=").append(qualiteStage);
        sb.append(", date=").append(date);
        sb.append(", pedagogieFormateur=").append(pedagogieFormateur);
        sb.append(", maitriseFormateur=").append(maitriseFormateur);
        sb.append(", disponibiliteFormateur=").append(disponibiliteFormateur);
        sb.append(", reponseFormateur=").append(reponseFormateur);
        sb.append(", animationFormateur=").append(animationFormateur);
        sb.append(", satisfactionUtilisateur=").append(satisfactionUtilisateur);
        sb.append(", autreProjet=").append(autreProjet);
        sb.append(", moyenneNote=").append(moyenneNote);
        sb.append('}');
        return sb.toString();
    }
}
