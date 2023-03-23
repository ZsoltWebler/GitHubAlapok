public class Playstation extends Konzol {
    public Playstation() {
        super("Playstation 5");
    }

    @Override
    public void jatszik(Jatek game, int skill) throws GitGud, NemTamogatottJatek {
        if (game.getConsole().getName() != this.getName()) {
            throw new NemTamogatottJatek(game.getName() + " nincs támogatva " + this.getName() + "-ön");
        }

        if (skill < game.getDifficulty()) {
            throw new GitGud();
        }
    }
}
