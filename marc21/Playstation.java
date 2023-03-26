package marc21;

public class Playstation extends Konzol{

   private final String consoleName = "Playstation 5";


    public Playstation(String consoleName) {
        super(consoleName);
    }

    public void jatszik(Jatek jatek, Jatekos skill) throws GitGud, NemTamogatottJatek {
        if (jatek.getKonzolType().getConsoleName().equals(getConsoleName())
                && skill.getSkill() >= jatek.getGameLevel() ) {
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
