package marc21;

public abstract class Konzol {

    private String consoleName;


    public Konzol(String consoleName) {
        this.consoleName = consoleName;
    }

    public String getConsoleName() {

        return consoleName;
    }

    public boolean jatszik (Jatek jatek, int skill) throws GitGud, NemTamogatottJatek  {

        return false;

    }
}
