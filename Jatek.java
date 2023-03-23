package Mar21;

public class Jatek {
    String nev;
    int nehezseg;
    String konzolType;

    public Jatek(String nev, int nehezseg, String konzolType) {
        if (nehezseg < 0) {
            this.nehezseg = 0;
        } else if (nehezseg > 10) {
            this.nehezseg = 10;
        } else {
            this.nehezseg = nehezseg;
        }
        this.nev = nev;
        this.konzolType = konzolType;
    }

    public String getNev() {
        return nev;
    }


    public int getNehezseg() {
        return nehezseg;
    }

    public String getKonzolType() {
        return konzolType;
    }

}
