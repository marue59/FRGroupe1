package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "is_intra")
    private boolean isIntra;

    @Column(name = "lieu")
    private String lieu;

    // Construct
    public Session() {
        super();
    }

    public Session(Long id, Date date, boolean isIntra, String lieu) {
        this.id = id;
        this.date = date;
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
        final StringBuilder sb = new StringBuilder("Session{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", isIntra=").append(isIntra);
        sb.append(", lieu='").append(lieu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
