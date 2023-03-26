package marc21;

import java.util.ArrayList;

public class Jatekos {

    private String gamerName;
    private int skill;

    private Konzol usedConsole;

    private Jatek playedGame;
    private ArrayList<Jatek> playedGames = new ArrayList<>();

    public Jatekos(String gamerName, int skill, Konzol usedConsole, Jatek playedGame) {
        this.gamerName = gamerName;

        if (skill < 0) {
            this.skill = 0;
        } else if ( skill > 10) {
            this.skill = 10;

        } else {
            this.skill = skill;
        }

        this.usedConsole = usedConsole;

        playedGames.add(playedGame);
    }

    public String getGamerName() {
        return gamerName;
    }

    public int getSkill() {
        return skill;
    }

    public Konzol getUsedConsole() {
        return usedConsole;
    }

    public Jatek getPlayedGame() {
        return playedGame;
    }

    public ArrayList<Jatek> getPlayedGames() {
        return playedGames;
    }

    public String kockul () throws GitGud, NemTamogatottJatek {
        for (Jatek game: playedGames
             ) {

         if (game.getKonzolType().jatszik(game, getSkill())){
             skill++;
         } else {
             return getGamerName() + " nevu jatekos nem tudott a " + game.getGameName() +
                     " jatekkal jatszani!";
         };

            }

        return null;
    }
}
