package feladatIllesVanessza;

public class Jatek {



    private String jatekNeve;
    private int nehezsegiSzint;

    private String konzol;


    public Jatek(String jatekNeve, int nehezsegiSzint, String konzol) {
        this.jatekNeve = jatekNeve;
        this.nehezsegiSzint = nehezsegiSzint;
        this.konzol = konzol;
    }

    public void setNehezsegiSzint(int nehezsegiSzint) {
       if(nehezsegiSzint < 0){
           this.nehezsegiSzint = 0;
       } else if (nehezsegiSzint > 10) {
           this.nehezsegiSzint = 10;
       } else {
           this.nehezsegiSzint = nehezsegiSzint;
       }
    }


    public String getJatekNeve() {
        return jatekNeve;
    }

    public int getNehezsegiSzint() {
        return nehezsegiSzint;
    }

    public String getKonzol() {
        return konzol;
    }
}
