public class Jatekos {
    private String name;
    private int skill;
    private Konzol console;
    private Jatek[] gameList;

    public Jatekos(String name, int skill, Konzol console, Jatek[] gameList) {
        this.name = name;
        this.console = console;
        this.gameList = gameList;

        if (skill < 0) this.skill = 0;
        else if (skill > 10) this.skill = 10;
        else this.skill = skill;
    }

    public void kockul() {
        try {
            for (Jatek game : gameList) {
                console.jatszik(game, this.skill);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        this.skill++;
    }
}
