package FR.Groupe1.ITTraining.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("formateur") // la valeur de la colonne 'role' qui permet de déterminer si c'est un formateur ou non.
public class Formateur extends Utilisateur{
        @Column(name = "note_moyenne")
        private Double noteMoyenne;

        @Column(name = "is_technique")
        private boolean isTechnique;

        @Column(name = "is_pedagogique")
        private boolean isPedagogique;

        @Column(name = "is_prerequis")
        private boolean isPrerequis;







        // Constructeurs
    public Formateur() {
    }


    public Formateur(Long id, String nom, String prenom, String adresse, String email, String telephone, boolean isTest, Session session, Test test, Entreprise entreprise, Evaluation evaluation, ServiceCommercialeSav sav, Double noteMoyenne, boolean isTechnique, boolean isPedagogique, boolean isPrerequis) {
        super(id, nom, prenom, adresse, email, telephone, isTest, session, test, entreprise, evaluation, sav);
        this.noteMoyenne = noteMoyenne;
        this.isTechnique = isTechnique;
        this.isPedagogique = isPedagogique;
        this.isPrerequis = isPrerequis;
    }






    // Getters & Setters

        public Double getNoteMoyenne() {
        return noteMoyenne;
    }

        public void setNoteMoyenne(Double noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }

        public boolean isTechnique() {
        return isTechnique;
    }

        public void setTechnique(boolean technique) {
        isTechnique = technique;
    }

        public boolean isPedagogique() {
        return isPedagogique;
    }

        public void setPedagogique(boolean pedagogique) {
        isPedagogique = pedagogique;
    }

        public boolean isPrerequis() {
        return isPrerequis;
    }

        public void setPrerequis(boolean prerequis) {
        isPrerequis = prerequis;
    }







        // Méthodes

        @Override
        public String toString() {
        final StringBuilder sb = new StringBuilder("Formateur{");
        sb.append("noteMoyenne=").append(noteMoyenne);
        sb.append(", isTechnique=").append(isTechnique);
        sb.append(", isPedagogique=").append(isPedagogique);
        sb.append(", isPrerequis=").append(isPrerequis);
        sb.append('}');
        return sb.toString();
    }
}
