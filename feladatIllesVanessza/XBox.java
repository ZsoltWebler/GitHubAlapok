package feladatIllesVanessza;

public class XBox extends Konzol{
    public XBox() {
        super("XBOX One");
    }

    @Override
    void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek {
        if(!jatek.getKonzol().equals(this.getNev())){
            throw new NemTamogatottJatek();
        } else {
            if(jatek.getNehezsegiSzint() > (skill + 2)) {
                throw new GitGud();
            }
        }
    }
}
