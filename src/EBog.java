public class EBog extends Materiale {
    private String format;

    public EBog(String ISBN, String titel, String forfatter, int år, String udgiver, String genre, String format) {
        super(ISBN, titel, forfatter, år, udgiver, genre);
        this.format = format;
    }
}