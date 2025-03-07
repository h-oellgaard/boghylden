import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Låner {
    private String lånernr;
    private List<Udlån> udlånsliste;

    public Låner(String lånernr) {
        this.lånernr = lånernr;
        this.udlånsliste = new ArrayList<>();
    }

    public void fornyLån(Udlån udlån) {
        if (udlånsliste.contains(udlån)) {
            udlån.fornyLån();
        } else {
            System.out.println("Du kan kun forny dine egne lån.");
        }
    }

    public void afleverLån(Udlån udlån) {
        if (udlånsliste.contains(udlån)) {
            udlån.afleverLån();
        } else {
            System.out.println("Du kan kun aflevere dine egne lån.");
        }
    }

    public List<Udlån> getUdlånsliste() {
        return udlånsliste;
    }

    public Udlån opretLån(Materiale materiale, LocalDate startDato, LocalDate afleveringsdato) {
        Udlån nytUdlån = new Udlån(materiale, this.lånernr, startDato, afleveringsdato);
        udlånsliste.add(nytUdlån);
        return nytUdlån;
    }
}
