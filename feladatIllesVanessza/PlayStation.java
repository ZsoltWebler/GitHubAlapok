package feladatIllesVanessza;

public class PlayStation extends Konzol{
    public PlayStation() {
        super("Playstation 5");
    }

    @Override
    void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek {
        if(!jatek.getKonzol().equals(this.getNev())){
            throw new NemTamogatottJatek();
        } else {
            if(!(jatek.getNehezsegiSzint() <= skill)) {
                throw new GitGud();
            }
        }
    }
}
