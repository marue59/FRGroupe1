package FR.Groupe1.ITTraining.entity;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @Column(name = "idUtilisateur", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "numTel")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "isFormateur")
    private boolean testIsValide;
    @Column(name = "noteMoyenne")
    private Double noteMoyenne;

    @Column(name = "isTechValidate")
    private boolean seanceValidationTechnique;
    @Column(name = "isPedagogieValide")
    private boolean seanceValidationPedagigique;
    @Column(name = "isStagiaireValide")
    private boolean prerequisStagiaireValide;

    //pour version v2
    private Role role;

    // Construct
    public Utilisateur() {
        super();
    }

    public Utilisateur(Long id, String nom, String prenom, String telephone, String email, boolean testIsValide,
                       Double noteMoyenne, boolean seanceValidationTechnique, boolean seanceValidationPedagigique,
                       boolean prerequisStagiaireValide, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.testIsValide = testIsValide;
        this.noteMoyenne = noteMoyenne;
        this.seanceValidationTechnique = seanceValidationTechnique;
        this.seanceValidationPedagigique = seanceValidationPedagigique;
        this.prerequisStagiaireValide = prerequisStagiaireValide;
        this.role = role;
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

    public boolean isTestIsValide() {
        return testIsValide;
    }

    public void setTestIsValide(boolean testIsValide) {
        this.testIsValide = testIsValide;
    }

    public Double getNoteMoyenne() {
        return noteMoyenne;
    }

    public void setNoteMoyenne(Double noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }

    public boolean isSeanceValidationTechnique() {
        return seanceValidationTechnique;
    }

    public void setSeanceValidationTechnique(boolean seanceValidationTechnique) {
        this.seanceValidationTechnique = seanceValidationTechnique;
    }

    public boolean isSeanceValidationPedagigique() {
        return seanceValidationPedagigique;
    }

    public void setSeanceValidationPedagigique(boolean seanceValidationPedagigique) {
        this.seanceValidationPedagigique = seanceValidationPedagigique;
    }

    public boolean isPrerequisStagiaireValide() {
        return prerequisStagiaireValide;
    }

    public void setPrerequisStagiaireValide(boolean prerequisStagiaireValide) {
        this.prerequisStagiaireValide = prerequisStagiaireValide;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


 // Methodes :

    @Override
    public String toString() {
        return "UtilisateurDo{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", testIsValide=" + testIsValide +
                ", noteMoyenne=" + noteMoyenne +
                ", seanceValidationTechnique=" + seanceValidationTechnique +
                ", seanceValidationPedagigique=" + seanceValidationPedagigique +
                ", prerequisStagiaireValide=" + prerequisStagiaireValide +
                ", role=" + role +
                '}';
    }
}