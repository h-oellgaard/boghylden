import java.util.ArrayList;
import java.util.List;

public class Medarbejder {
    private String medarbejdernr;
    private String stilling;
    private List<Låner> lånerListe;


    public Medarbejder(String medarbejdernr, String stilling) {
        this.medarbejdernr = medarbejdernr;
        this.stilling = stilling;
        this.lånerListe = new ArrayList<>();
    }

    public Låner opretLåner(String lånernr) {
        Låner nyLåner = new Låner(lånernr);
        lånerListe.add(nyLåner);
        return nyLåner;
    }

    public void sletLåner(Låner låner) {
        lånerListe.remove(låner);
    }

    public void opdaterLåner(Låner låner) {
        System.out.println("Låner " + låner + " er opdateret.");
    }
}
