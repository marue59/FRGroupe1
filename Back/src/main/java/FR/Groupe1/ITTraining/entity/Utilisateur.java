package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // la table est héritée par la classe Formateur
@DiscriminatorColumn(name = "role") // La colonne role joue le role du discriminant est permet de différencier le formateur du non formateur

public class Utilisateur {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "is_test")
    private boolean isTest;







    // Clés étrangères


    @ManyToOne
    @PrimaryKeyJoinColumn(name = "session_id", referencedColumnName = "id")
    private Session session;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "test_id", referencedColumnName = "id")
    private Test test;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "entreprise_id", referencedColumnName = "id")
    private Entreprise entreprise;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "evaluation_id", referencedColumnName = "id")
    private Evaluation evaluation;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "sav_id", referencedColumnName = "id")
    private Sav sav;


    // Constructeurs
    public Utilisateur() {
        super();
    }

    public Utilisateur(Long id, String nom, String prenom, String adresse, String email, String telephone, boolean isTest, Session session, Test test, Entreprise entreprise, Evaluation evaluation, Sav sav) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.isTest = isTest;
        this.session = session;
        this.test = test;
        this.entreprise = entreprise;
        this.evaluation = evaluation;
        this.sav = sav;
    }


    // Getters &  Setters
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean test) {
        isTest = test;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Sav getSav() {
        return sav;
    }

    public void setSav(Sav sav) {
        this.sav = sav;
    }

    // Methodes :


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Utilisateur{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append(", isTest=").append(isTest);
        sb.append('}');
        return sb.toString();
    }
}