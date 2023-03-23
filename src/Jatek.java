public class Jatek {
    private String name;
    private int difficulty;
    private Konzol console;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public Konzol getConsole() {
        return console;
    }

    public void setConsole(Konzol console) {
        this.console = console;
    }

    public Jatek(String name, int difficulty, Konzol console) {
        this.name = name;
        this.console = console;

        if (difficulty < 0) this.difficulty = 0;
        else if (difficulty > 10) this.difficulty = 10;
        else this.difficulty = difficulty;
    }
}
