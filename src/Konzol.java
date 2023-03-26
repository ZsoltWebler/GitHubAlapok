public abstract class Konzol {

    String konzolNeve;

    public abstract void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek;

    public Konzol(String konzolNeve) {
        this.konzolNeve = konzolNeve;
    }

    public String getKonzolNeve() {
        return this.konzolNeve;
    }

    public void setKonzolNeve(String konzolNeve) {
        this.konzolNeve = konzolNeve;
    }
}
