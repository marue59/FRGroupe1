package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "sav")
public class Sav {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "client")
    private String client;

    @Column(name = "question_stagiaire")
    private String questionStagiaire;

    @Column(name = "ca")
    private Double ca;

    @Column(name = "nombre_formation")
    private int nombreFormation;

    // Constructor

    public Sav() {
    }

    public Sav(Long id, String client, String questionStagiaire, Double ca, int nombreFormation) {
        this.id = id;
        this.client = client;
        this.questionStagiaire = questionStagiaire;
        this.ca = ca;
        this.nombreFormation = nombreFormation;
    }

    // Getter Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getQuestionStagiaire() {
        return questionStagiaire;
    }

    public void setQuestionStagiaire(String questionStagiaire) {
        this.questionStagiaire = questionStagiaire;
    }

    public Double getCa() {
        return ca;
    }

    public void setCa(Double ca) {
        this.ca = ca;
    }

    public int getNombreFormation() {
        return nombreFormation;
    }

    public void setNombreFormation(int nombreFormation) {
        this.nombreFormation = nombreFormation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServiceCommercialeSAV{");
        sb.append("id=").append(id);
        sb.append(", client='").append(client).append('\'');
        sb.append(", questionStagiaire='").append(questionStagiaire).append('\'');
        sb.append(", ca=").append(ca);
        sb.append(", nombreFormation=").append(nombreFormation);
        sb.append('}');
        return sb.toString();
    }
}

