public class Bog extends Materiale {
    private boolean largePrint;

    public Bog(String ISBN, String titel, String forfatter, int år, String udgiver, String genre, boolean largePrint) {
        super(ISBN, titel, forfatter, år, udgiver, genre);
        this.largePrint = largePrint;
    }
}