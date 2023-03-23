package Mar21;

public class XBOX extends Konzol{
    final String nev = "XBOX One";
    public XBOX() {

    }
    @Override
    void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek{
        if(jatek.getNehezseg()-2 > skill) {
            throw new GitGud("GitGud kivetel!");
        }

        if(!jatek.getKonzolType().equalsIgnoreCase(this.nev)) {
            throw new NemTamogatottJatek("Nem tamogatott jatek!");
        }
    }
    @Override
    public String getNev() {
        return this.nev;
    }
}
