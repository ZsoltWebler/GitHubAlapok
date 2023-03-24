import java.util.List;

public class Jatekos {
    private String name;
    private int skill;
    private Konzol console;
    private List<Jatek> gameList;

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

    public List<Jatek> getGameList() {
        return gameList;
    }

    public void setGameList(List<Jatek> gameList) {
        this.gameList = gameList;
    }

    public Jatekos(String name, int skill, Konzol console, List<Jatek> gameList) {
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
        gameList.forEach(game -> {
            try {
                console.jatszik(game, this.skill);
                this.skill++;
            } catch (Exception e) {
                String message = this.name + " nem tudta végigjátszani a " + game.getName() + "-t";

                if (e.getClass().getName().equals("GitGud")) {
                    message += ", mert nem elég ügyes";
                }

                if (e.getClass().getName().equals("NemTamogatottJatek")) {
                    message += ", mert a(z) " + this.console.getName() + " nem támogatja ezt a játékot";
                }

                System.err.println(message + ".");
            }
        });
    }
}
