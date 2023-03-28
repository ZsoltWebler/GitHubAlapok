public class NemTamogatottJatek extends Exception {

    public NemTamogatottJatek() {
        super("A konzolod nem támogatja ezt a játékot!");
    }

    public NemTamogatottJatek(String message) {
        super(message);
    }

}
