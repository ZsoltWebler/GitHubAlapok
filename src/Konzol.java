public abstract class Konzol {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Konzol(String name) {
        this.name = name;
    }

    public abstract void jatszik(Jatek game, int skill) throws GitGud, NemTamogatottJatek;
}
