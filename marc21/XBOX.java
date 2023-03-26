package marc21;

import java.io.IOException;

public class XBOX extends Konzol{

    public final String consoleName = "XBOX One";
    public XBOX(String consoleName) {
        super(consoleName);
    }


    public void jatszik(Jatek jatek, Jatekos skill) throws GitGud, NemTamogatottJatek {
        if (jatek.getKonzolType().getConsoleName().equals(getConsoleName())
                && skill.getSkill() + 2 > jatek.getGameLevel() ) {
            System.out.println("you can play with this game, it is your level!");
        }
        else if (!jatek.getKonzolType().getConsoleName().equals(getConsoleName()))  {
           throw new GitGud();

        }
        else {

            throw new NemTamogatottJatek();
        }
    }
}
