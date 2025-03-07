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
        try {
            System.out.println("Fornyr....");
            Thread.sleep(2000);
            // Alice fornyer lånet
            alice.fornyLån(udlånAlice);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Afleverer....");
            Thread.sleep(2000);
            alice.afleverLån(udlånAlice);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Alice afleverer bogen

        // Udskriv låneinfo igen
        System.out.println("Info: " + udlånAlice.getInfo());
    }
}
