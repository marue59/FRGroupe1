package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class TestDo {

    @Id
    @Column(name = "idTest", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "reponse")
    private String reponse;

  // Construct

    public  TestDo() {
        super();
    }

    public TestDo(Long id, String question, String reponse) {
        this.id = id;
        this.question = question;
        this.reponse = reponse;
    }

    // Getter Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    // Methodes :

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", question=" + question +
                ", reponse=" + reponse +
                '}';
    }
}
