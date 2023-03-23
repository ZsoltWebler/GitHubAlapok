package Mar21;

public abstract class Konzol {

    public Konzol(){

    };
    abstract void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek;
    public abstract String getNev();
}
