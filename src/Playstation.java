import java.util.Objects;

public class Playstation extends Konzol {


    public Playstation() {
        super("Playstation 5");
    }


    @Override
    public void jatszik(Jatek jatek, int skill) throws GitGud, NemTamogatottJatek {
        if (!Objects.equals(jatek.getKonzol().getKonzolNeve(), this.getKonzolNeve())) {
            throw new NemTamogatottJatek("Ez a játék nem támogatott a " + this.getKonzolNeve() + " konzolon!");
        }

        if (skill < jatek.getNehezsegiSzint()) {
            throw new GitGud();
        }
    }
}
