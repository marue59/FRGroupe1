package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "logistique")
public class LogistiqueDo {

    @Id
    @Column(name = "idLogistique", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "salleReserve")
    public boolean salleReserve;

    @Column(name = "salleInstallee")
    public boolean salleInstallee;

    @Column(name = "supportImprime")
    public boolean supportImprime;

    @Column(name = "machineInstallee")
    public boolean machineInstallee;

    @Column(name = "formateurContacte")
    public boolean formateurContacte;

    @Column(name = "formulaireGenere")
    public boolean formulaireGenere;

    @Column(name = "convocationStagiaireEnvoyee")
    public boolean convocationStagiaireEnvoyee;

    @Column(name = "planning")
    public boolean planningAJour;

    @Column(name = "listeImprimee")
    public boolean listeImprimee;

    @Column(name = "ticketRepasImprime")
    public boolean ticketRepasImprime;

    // Construct
    public LogistiqueDo() {
        super();
    }

    public LogistiqueDo(Long id, boolean salleReserve, boolean salleInstallee, boolean supportImprime,
                      boolean machineInstallee, boolean formateurContacte, boolean formulaireGenere,
                      boolean convocationStagiaireEnvoyee, boolean planningAJour, boolean listeImprimee,
                      boolean ticketRepasImprime) {
        this.id = id;
        this.salleReserve = salleReserve;
        this.salleInstallee = salleInstallee;
        this.supportImprime = supportImprime;
        this.machineInstallee = machineInstallee;
        this.formateurContacte = formateurContacte;
        this.formulaireGenere = formulaireGenere;
        this.convocationStagiaireEnvoyee = convocationStagiaireEnvoyee;
        this.planningAJour = planningAJour;
        this.listeImprimee = listeImprimee;
        this.ticketRepasImprime = ticketRepasImprime;
    }

    // Getter Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSalleReserve() {
        return salleReserve;
    }

    public void setSalleReserve(boolean salleReserve) {
        this.salleReserve = salleReserve;
    }

    public boolean isSalleInstallee() {
        return salleInstallee;
    }

    public void setSalleInstallee(boolean salleInstallee) {
        this.salleInstallee = salleInstallee;
    }

    public boolean isSupportImprime() {
        return supportImprime;
    }

    public void setSupportImprime(boolean supportImprime) {
        this.supportImprime = supportImprime;
    }

    public boolean isMachineInstallee() {
        return machineInstallee;
    }

    public void setMachineInstallee(boolean machineInstallee) {
        this.machineInstallee = machineInstallee;
    }

    public boolean isFormateurContacte() {
        return formateurContacte;
    }

    public void setFormateurContacte(boolean formateurContacte) {
        this.formateurContacte = formateurContacte;
    }

    public boolean isFormulaireGenere() {
        return formulaireGenere;
    }

    public void setFormulaireGenere(boolean formulaireGenere) {
        this.formulaireGenere = formulaireGenere;
    }

    public boolean isConvocationStagiaireEnvoyee() {
        return convocationStagiaireEnvoyee;
    }

    public void setConvocationStagiaireEnvoyee(boolean convocationStagiaireEnvoyee) {
        this.convocationStagiaireEnvoyee = convocationStagiaireEnvoyee;
    }

    public boolean isPlanningAJour() {
        return planningAJour;
    }

    public void setPlanningAJour(boolean planningAJour) {
        this.planningAJour = planningAJour;
    }

    public boolean isListeImprimee() {
        return listeImprimee;
    }

    public void setListeImprimee(boolean listeImprimee) {
        this.listeImprimee = listeImprimee;
    }

    public boolean isTicketRepasImprime() {
        return ticketRepasImprime;
    }

    public void setTicketRepasImprime(boolean ticketRepasImprime) {
        this.ticketRepasImprime = ticketRepasImprime;
    }

     // Methodes :

    @Override
    public String toString() {
        return "Logistique{" +
                "id=" + id +
                ", salleReserve=" + salleReserve +
                ", salleInstallee=" + salleInstallee +
                ", supportImprime=" + supportImprime +
                ", machineInstallee=" + machineInstallee +
                ", formateurContacte=" + formateurContacte +
                ", formulaireGenere=" + formulaireGenere +
                ", convocationStagiaireEnvoyee=" + convocationStagiaireEnvoyee +
                ", planningAJour=" + planningAJour +
                ", listeImprimee=" + listeImprimee +
                ", ticketRepasImprime=" + ticketRepasImprime +
                '}';
    }
}
