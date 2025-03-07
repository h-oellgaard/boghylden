import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Opret en medarbejder
        Medarbejder bibliotekar = new Medarbejder("M123", "Bibliotekar");

        // Opret en låner
        Låner alice = bibliotekar.opretLåner("L001");

        // Opret en bog
        Materiale bog = new Bog("978-3-16-148410-0", "Java Programming", "John Doe", 2023, "TechBooks", "Programming", false);

        // Opret et udlån
        Udlån udlånAlice = alice.opretLån(bog, LocalDate.now(), LocalDate.now().plusWeeks(4));

        // Udskriv låneinfo
        System.out.println(udlånAlice.getInfo());

        // Alice fornyer lånet
        alice.fornyLån(udlånAlice);

        // Alice afleverer bogen
        alice.afleverLån(udlånAlice);

        // Udskriv låneinfo igen
        System.out.println(udlånAlice.getInfo());
    }
}
