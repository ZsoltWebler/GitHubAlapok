public class NemTamogatottJatek extends Exception {
    public NemTamogatottJatek() {
        super("Hiba: Nem támogatott játék!");
    }

    public NemTamogatottJatek(String message) {
        super(message);
    }
}
