package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "session")
public class SessionDo {

    @Id
    @Column(name = "idSession", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "prix")
    private double prix;

    @Column(name = "isIntra")
    private boolean isIntra;

    @Column(name = "lieu")
    private String lieu;

    // Construct
  public SessionDo() {
      super();
  }

    public SessionDo(Long id, Date date, double prix, boolean isIntra, String lieu) {
        this.id = id;
        this.date = date;
        this.prix = prix;
        this.isIntra = isIntra;
        this.lieu = lieu;
    }

     // Getter Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isIntra() {
        return isIntra;
    }

    public void setIntra(boolean intra) {
        isIntra = intra;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    // Methodes :

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", date=" + date +
                ", prix=" + prix +
                ", isIntra=" + isIntra +
                ", lieu='" + lieu + '\'' +
                '}';
    }
}
