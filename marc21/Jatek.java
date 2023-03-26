package marc21;




public class Jatek {

    private String gameName;
    private int gameLevel;

    private Konzol konzolType;

    public Jatek(String gameName, int gameLevel, Konzol konzolType) {
        this.gameName = gameName;

        if (gameLevel < 0) {
            this.gameLevel = 0;
        } else if (gameLevel > 10) {
            this.gameLevel = 10;
        } else {
            this.gameLevel = gameLevel;
        }


        this.konzolType = konzolType;
    }

    public Konzol getKonzolType() {
        return konzolType;
    }

    public void setKonzolType(Konzol konzolType) {
        this.konzolType = konzolType;
    }

    public int getGameLevel() {
        return gameLevel;
    }

    public String getGameName() {
        return gameName;
    }
}
