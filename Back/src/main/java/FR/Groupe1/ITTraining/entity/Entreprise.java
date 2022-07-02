package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "entreprise")
public class EntrepriseDo {

    @Id
    @Column(name = "id_entreprise")
    @GeneratedValue
    private Long id;

    @Column(name = "nom_entreprise")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "code_postal")
    private String codePostal;

    @Column(name = "numTel")
    private String telephone;

    @Column(name = "ville")
    private String ville;

    @Column(name = "email")
    private String email;

  // Construct
    public EntrepriseDo() {
    }


    public EntrepriseDo(String nom, String adresse, String codePostal, String telephone, String ville, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.telephone = telephone;
        this.ville = ville;
        this.email = email;
    }

    public EntrepriseDo(Long id, String nom, String adresse, String codePostal, String telephone, String ville, String email) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.telephone = telephone;
        this.ville = ville;
        this.email = email;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntrepriseDO{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", codePostal='").append(codePostal).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');
        sb.append(", ville='").append(ville).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

