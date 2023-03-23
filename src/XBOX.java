public class XBOX extends Konzol {
    public XBOX() {
        super("XBOX One");
    }

    @Override
    public void jatszik(Jatek game, int skill) throws GitGud, NemTamogatottJatek {
        if (game.getConsole().getName() != this.getName()) {
            throw new NemTamogatottJatek(game.getName() + " nincs támogatva " + this.getName() + "-on");
        }

        if (skill < game.getDifficulty() + 2) {
            throw new GitGud();
        }
    }
}
