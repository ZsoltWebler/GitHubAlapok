public class GitGud extends Exception {
    public GitGud() {
        super("Hiba: Elégtelen ügyesség!");
    }

    public GitGud(String message) {
        super(message);
    }
}
