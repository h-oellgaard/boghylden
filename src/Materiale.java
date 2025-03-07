public abstract class Materiale {
    private String ISBN;
    private String titel;
    private String forfatter;
    private int år;
    private String udgiver;
    private String genre;
    private boolean erTilgængelig;

    public Materiale(String ISBN, String titel, String forfatter, int år, String udgiver, String genre) {
        this.ISBN = ISBN;
        this.titel = titel;
        this.forfatter = forfatter;
        this.år = år;
        this.udgiver = udgiver;
        this.genre = genre;
        this.erTilgængelig = true;
    }

    public boolean erTilgængelig() {
        return erTilgængelig;
    }

    public void sætTilgængelig(boolean status) {
        this.erTilgængelig = status;
    }

    public String getDetails() {
        return titel + " af " + forfatter + " (" + år + "), " + udgiver + ". Genre: " + genre;
    }
}
