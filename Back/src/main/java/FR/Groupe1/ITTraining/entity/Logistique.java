package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "logistique")
public class Logistique {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "is_salleInstallee")
    public boolean isSalleInstallee;

    @Column(name = "is_salleReservee")
    public boolean isSalleReservee;

    @Column(name = "is_supportImprime")
    public boolean isSupportImprime;

    @Column(name = "is_machineInstallee")
    public boolean isMachineInstallee;

    @Column(name = "is_formateurContacte")
    public boolean isFormateurContacte;

    @Column(name = "is_formulaireGenere")
    public boolean isFormulaireGenere;

    @Column(name = "is_convocationEnvoyee")
    public boolean isConvocationEnvoyee;

    @Column(name = "is_planningAJour")
    public boolean isPlanningAJour;

    @Column(name = "is_listeImprimee")
    public boolean isListeImprimee;

    @Column(name = "is_ticketRepasImprimee")
    public boolean isTicketRepasImprimee;

    // Construct
    public Logistique() {
        super();
    }

    public Logistique(Long id, boolean isSalleInstallee, boolean isSalleReservee, boolean isSupportImprime,
                      boolean isMachineInstallee, boolean isFormateurContacte, boolean isFormulaireGenere,
                      boolean isConvocationEnvoyee, boolean isPlanningAJour, boolean isListeImprimee,
                      boolean isTicketRepasImprimee) {
        this.id = id;
        this.isSalleInstallee = isSalleInstallee;
        this.isSalleReservee = isSalleReservee;
        this.isSupportImprime = isSupportImprime;
        this.isMachineInstallee = isMachineInstallee;
        this.isFormateurContacte = isFormateurContacte;
        this.isFormulaireGenere = isFormulaireGenere;
        this.isConvocationEnvoyee = isConvocationEnvoyee;
        this.isPlanningAJour = isPlanningAJour;
        this.isListeImprimee = isListeImprimee;
        this.isTicketRepasImprimee = isTicketRepasImprimee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSalleInstallee() {
        return isSalleInstallee;
    }

    public void setSalleInstallee(boolean salleInstallee) {
        isSalleInstallee = salleInstallee;
    }

    public boolean isSalleReservee() {
        return isSalleReservee;
    }

    public void setSalleReservee(boolean salleReservee) {
        isSalleReservee = salleReservee;
    }

    public boolean isSupportImprime() {
        return isSupportImprime;
    }

    public void setSupportImprime(boolean supportImprime) {
        isSupportImprime = supportImprime;
    }

    public boolean isMachineInstallee() {
        return isMachineInstallee;
    }

    public void setMachineInstallee(boolean machineInstallee) {
        isMachineInstallee = machineInstallee;
    }

    public boolean isFormateurContacte() {
        return isFormateurContacte;
    }

    public void setFormateurContacte(boolean formateurContacte) {
        isFormateurContacte = formateurContacte;
    }

    public boolean isFormulaireGenere() {
        return isFormulaireGenere;
    }

    public void setFormulaireGenere(boolean formulaireGenere) {
        isFormulaireGenere = formulaireGenere;
    }

    public boolean isConvocationEnvoyee() {
        return isConvocationEnvoyee;
    }

    public void setConvocationEnvoyee(boolean convocationEnvoyee) {
        isConvocationEnvoyee = convocationEnvoyee;
    }

    public boolean isPlanningAJour() {
        return isPlanningAJour;
    }

    public void setPlanningAJour(boolean planningAJour) {
        isPlanningAJour = planningAJour;
    }

    public boolean isListeImprimee() {
        return isListeImprimee;
    }

    public void setListeImprimee(boolean listeImprimee) {
        isListeImprimee = listeImprimee;
    }

    public boolean isTicketRepasImprimee() {
        return isTicketRepasImprimee;
    }

    public void setTicketRepasImprimee(boolean ticketRepasImprimee) {
        isTicketRepasImprimee = ticketRepasImprimee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Logistique{");
        sb.append("id=").append(id);
        sb.append(", isSalleInstallee=").append(isSalleInstallee);
        sb.append(", isSalleReservee=").append(isSalleReservee);
        sb.append(", isSupportImprime=").append(isSupportImprime);
        sb.append(", isMachineInstallee=").append(isMachineInstallee);
        sb.append(", isFormateurContacte=").append(isFormateurContacte);
        sb.append(", isFormulaireGenere=").append(isFormulaireGenere);
        sb.append(", isConvocationEnvoyee=").append(isConvocationEnvoyee);
        sb.append(", isPlanningAJour=").append(isPlanningAJour);
        sb.append(", isListeImprimee=").append(isListeImprimee);
        sb.append(", isTicketRepasImprimee=").append(isTicketRepasImprimee);
        sb.append('}');
        return sb.toString();
    }
}
