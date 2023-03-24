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
        if ((difficulty < 0 || (difficulty > 10))) {
            this.difficulty = Math.min(Math.max(difficulty, 0), 10);
        } else {
            this.difficulty = difficulty;
        }
    }

    public Konzol getConsole() {
        return console;
    }

    public void setConsole(Konzol console) {
        this.console = console;
    }

    public Jatek(String name, int difficulty, Konzol console) {
        this.name = name;
        this.setDifficulty(difficulty);
        this.console = console;
    }
}
