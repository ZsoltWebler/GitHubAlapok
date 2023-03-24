public class XBOX extends Konzol {
    public XBOX() {
        super("XBOX One");
    }

    @Override
    public void jatszik(Jatek game, int skill) throws GitGud, NemTamogatottJatek {
        if (game.getConsole().getName().equals(this.getName())) {
            throw new NemTamogatottJatek(game.getName() + " nincs támogatva " + this.getName() + "-on.");
        }

        if (skill + 2 < game.getDifficulty()) {
            throw new GitGud("A játékos nem elég ügyes.");
        }
    }
}
