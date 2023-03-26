public class Jatek {

    String jatekNev;
    int nehezsegiSzint;
    Konzol konzol;

    public Jatek(String jatekNev, int nehezsegiSzint, Konzol konzol) {
        this.jatekNev = jatekNev;
        this.nehezsegiSzint = nehezsegiSzint;
        this.konzol = konzol;
    }

    public String getJatekNev() {
        return this.jatekNev;
    }

    public int getNehezsegiSzint() {
        return this.nehezsegiSzint;
    }

    public Konzol getKonzol() {
        return this.konzol;
    }

    public void setJatekNev(String jatekNev) {
        this.jatekNev = jatekNev;
    }

    public void setKonzol(Konzol konzol) {
        this.konzol = konzol;
    }

    public void setNehezsegiSzint(int nehezsegiSzint) {
        if (nehezsegiSzint < 0) {
            this.nehezsegiSzint = 0;
        } else if (nehezsegiSzint >= 10) {
            this.nehezsegiSzint = 10;
        } else {
            this.nehezsegiSzint = nehezsegiSzint;
        }
    }
}
