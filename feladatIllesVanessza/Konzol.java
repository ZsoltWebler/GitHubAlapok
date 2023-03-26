package feladatIllesVanessza;

public abstract class Konzol{

    private String nev;

    abstract void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek;


    public Konzol(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }



}



