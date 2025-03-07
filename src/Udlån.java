import java.time.LocalDate;

public class Udlån {
    private Materiale materiale;
    private LocalDate startDato;
    private LocalDate afleveringsdato;
    private String lånernr;
    private String status; // aktiv, afleveret, overskreden

    public Udlån(Materiale materiale, String lånernr, LocalDate startDato, LocalDate afleveringsdato) {
        this.materiale = materiale;
        this.lånernr = lånernr;
        this.startDato = startDato;
        this.afleveringsdato = afleveringsdato;
        this.status = "aktiv";
        this.materiale.sætTilgængelig(false);
    }

    public void fornyLån() {
        if (status.equals("aktiv")) {
            afleveringsdato = afleveringsdato.plusWeeks(2);
            System.out.println("Lånet er fornyet. Ny afleveringsdato: " + afleveringsdato);
        } else {
            System.out.println("Lånet kan ikke fornyes, da det ikke er aktivt.");
        }
    }

    public void afleverLån() {
        if (status.equals("aktiv")) {
            status = "afleveret";
            materiale.sætTilgængelig(true);
            System.out.println("Bogen er afleveret.");
        } else {
            System.out.println("Lånet er allerede afsluttet.");
        }
    }

    public String getInfo() {
        return "Materiale: " + materiale.getDetails() + "\nStartdato: " + startDato + "\nAfleveringsdato: " + afleveringsdato + "\nStatus: " + status;
    }
}
