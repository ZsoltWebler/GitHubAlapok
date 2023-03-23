public class Jatekos {
    private String name;
    private int skill;
    private Konzol console;
    private Jatek[] gameList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        if (skill < 0) {
            this.skill = 0;
        }
        else if (skill > 10) {
            this.skill = 10;
        }
        else {
            this.skill = skill;
        }
    }

    public Konzol getConsole() {
        return console;
    }

    public void setConsole(Konzol console) {
        this.console = console;
    }

    public Jatek[] getGameList() {
        return gameList;
    }

    public void setGameList(Jatek[] gameList) {
        this.gameList = gameList;
    }

    public Jatekos(String name, int skill, Konzol console, Jatek[] gameList) {
        this.name = name;
        this.console = console;
        this.gameList = gameList;

        if (skill < 0) {
            this.skill = 0;
        }
        else if (skill > 10) {
            this.skill = 10;
        }
        else {
            this.skill = skill;
        }
    }

    public void kockul() {
        try {
            for (Jatek game : gameList) {
                console.jatszik(game, this.skill);
            }
        } catch (Exception e) {
            String message = this.name + "nem tudta végigjátszani a(z) " + game.getName() + "-t";

            if (e.instanceOf() == "GitGud") {
                message += ", mert nem elég ügyes";
            }

            if (e.instanceOf() == "NemTamogatottJatek") {
                message += ", mert a(z) " + this.console + " nem támogatja ezt a játékot"
            }

            System.err.println(message + ".");
        }

        this.skill++;
    }
}
