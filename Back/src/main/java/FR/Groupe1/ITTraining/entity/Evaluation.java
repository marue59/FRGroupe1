package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "evaluationSession")
public class EvaluationSession {

    @Id
    @Column(name = "idEvaluation")
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
    @Column(name = "maitrise_domaine_formateur")
    private Integer maitriseDomaineFormateur;
    @Column(name = "disponibilite_formateur")
    private Integer disponibiliteFormateur;
    @Column(name = "reponse_question_formateur")
    private Integer reponseQuestionFormateur;

    @Column(name = "technique_animation_formateur")
    private Integer satisfactionUtilisateur;
    @Column(name = "autre_projet_formation")
    private Integer autreProjetFormation;
    @Column(name = "moyenne")
    private Integer moyenne;

    public EvaluationSession() {
        super();
    }

    public EvaluationSession(Long id, Integer qualiteAccueil, Integer qualiteEnvironnement, Integer qualiteStage,
                             Date date, Integer pedagogieFormateur, Integer maitriseDomaineFormateur, Integer disponibiliteFormateur,
                             Integer reponseQuestionFormateur, Integer satisfactionUtilisateur,
                             Integer autreProjetFormation, Integer moyenne) {
        this.id = id;
        this.qualiteAccueil = qualiteAccueil;
        this.qualiteEnvironnement = qualiteEnvironnement;
        this.qualiteStage = qualiteStage;
        this.date = date;
        this.pedagogieFormateur = pedagogieFormateur;
        this.maitriseDomaineFormateur = maitriseDomaineFormateur;
        this.disponibiliteFormateur = disponibiliteFormateur;
        this.reponseQuestionFormateur = reponseQuestionFormateur;
        this.satisfactionUtilisateur = satisfactionUtilisateur;
        this.autreProjetFormation = autreProjetFormation;
        this.moyenne = moyenne;
    }

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

    public Integer getMaitriseDomaineFormateur() {
        return maitriseDomaineFormateur;
    }

    public void setMaitriseDomaineFormateur(Integer maitriseDomaineFormateur) {
        this.maitriseDomaineFormateur = maitriseDomaineFormateur;
    }

    public Integer getDisponibiliteFormateur() {
        return disponibiliteFormateur;
    }

    public void setDisponibiliteFormateur(Integer disponibiliteFormateur) {
        this.disponibiliteFormateur = disponibiliteFormateur;
    }

    public Integer getReponseQuestionFormateur() {
        return reponseQuestionFormateur;
    }

    public void setReponseQuestionFormateur(Integer reponseQuestionFormateur) {
        this.reponseQuestionFormateur = reponseQuestionFormateur;
    }


    public Integer getSatisfactionUtilisateur() {
        return satisfactionUtilisateur;
    }

    public void setSatisfactionUtilisateur(Integer satisfactionUtilisateur) {
        this.satisfactionUtilisateur = satisfactionUtilisateur;
    }

    public Integer getAutreProjetFormation() {
        return autreProjetFormation;
    }

    public void setAutreProjetFormation(Integer autreProjetFormation) {
        this.autreProjetFormation = autreProjetFormation;
    }

    public Integer getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Integer moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "EvaluationSessionDo{" +
                "id=" + id +
                ", qualiteAccueil=" + qualiteAccueil +
                ", qualiteEnvironnement=" + qualiteEnvironnement +
                ", qualiteStage=" + qualiteStage +
                ", date=" + date +
                ", pedagogieFormateur=" + pedagogieFormateur +
                ", maitriseDomaineFormateur=" + maitriseDomaineFormateur +
                ", disponibiliteFormateur=" + disponibiliteFormateur +
                ", reponseQuestionFormateur=" + reponseQuestionFormateur +
                ", satisfactionUtilisateur=" + satisfactionUtilisateur +
                ", autreProjetFormation=" + autreProjetFormation +
                ", moyenne=" + moyenne +
                '}';
    }
}
