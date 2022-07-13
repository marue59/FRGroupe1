package FR.Groupe1.ITTraining.entity;

import javax.persistence.*;

@Entity
@Table(name = "logistique")
public class Logistique {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "is_salle_installee")
    private boolean isSalleInstallee;

    @Column(name = "is_salle_reservee")
    private boolean isSalleReservee;

    @Column(name = "is_support_imprime")
    private boolean isSupportImprime;

    @Column(name = "is_machine_installee")
    private boolean isMachineInstallee;

    @Column(name = "is_formateur_contacte")
    private boolean isFormateurContacte;

    @Column(name = "is_formulaire_genere")
    private boolean isFormulaireGenere;

    @Column(name = "is_convocation_envoyee")
    private boolean isConvocationEnvoyee;

    @Column(name = "is_planning_ajour")
    private boolean isPlanningAJour;

    @Column(name = "is_liste_imprimee")
    private boolean isListeImprimee;

    @Column(name = "is_ticket_imprime")
    private boolean isTicketRepasImprime;







    // Clé étrangère

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "sav_id", referencedColumnName = "id")
    private ServiceCommercialeSav sav;








    // Constructeurs

    public Logistique() {
    }

    public Logistique(Long id, boolean isSalleInstallee, boolean isSalleReservee, boolean isSupportImprime,
                      boolean isMachineInstallee, boolean isFormateurContacte, boolean isFormulaireGenere,
                      boolean isConvocationEnvoyee, boolean isPlanningAJour, boolean isListeImprimee,
                      boolean isTicketRepasImprime, ServiceCommercialeSav sav) {
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
        this.isTicketRepasImprime = isTicketRepasImprime;
        this.sav = sav;
    }








    // Getters & Setters

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
        return isTicketRepasImprime;
    }

    public void setTicketRepasImprimee(boolean ticketRepasImprimee) {
        isTicketRepasImprime = ticketRepasImprimee;
    }

    public boolean isTicketRepasImprime() {
        return isTicketRepasImprime;
    }

    public void setTicketRepasImprime(boolean ticketRepasImprime) {
        isTicketRepasImprime = ticketRepasImprime;
    }

    public ServiceCommercialeSav getSav() {
        return sav;
    }

    public void setSav(ServiceCommercialeSav sav) {
        this.sav = sav;
    }








    // Méthodes

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
        sb.append(", isTicketRepasImprimee=").append(isTicketRepasImprime);
        sb.append('}');
        return sb.toString();
    }
}
