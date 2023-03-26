import java.util.Objects;

public class XBOX extends Konzol {


    public XBOX() {
        super("Xbox One");
    }

    @Override
    public void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek {
        if (!Objects.equals(jatek.getKonzol().getKonzolNeve(), this.getKonzolNeve())) {
            throw new NemTamogatottJatek("Ez a játék nem támogatott a " + this.getKonzolNeve() + " konzolon!");
        }

        if (skill + 2 < jatek.getNehezsegiSzint()) {
            throw new GitGud("Git gud, son!");
        }
    }
}
