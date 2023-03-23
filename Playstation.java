package Mar21;

public class Playstation extends Konzol{
    final String nev = "Playstation 5";
    public Playstation() {
        ;
    }

    @Override
    void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek{
        if(jatek.getNehezseg() > skill) {
            throw new GitGud("GitGud kivetel!");
        }

        if(!jatek.getKonzolType().equalsIgnoreCase(this.nev)) {
            throw new NemTamogatottJatek("Nem tamogatott jatek!");
        }
    }
    public String getNev() {
        return this.nev;
    }
}
