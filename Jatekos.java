package Mar21;

import java.util.ArrayList;
import java.util.List;

public class Jatekos {
    String nev;
    int skill;

    Konzol konzol;
    List<Jatek> jatekLista = new ArrayList<>();

    public Jatekos(String nev, int skill, Konzol konzol, List<Jatek> jatekLista) {
        this.nev = nev;
        if (skill < 0) {
            this.skill = 0;
        } else if (skill > 10) {
            this.skill = 10;
        } else {
            this.skill = skill;
        }
        this.konzol = konzol;
        this.jatekLista = jatekLista;
    }

    public void kockul() {
        for (Jatek j : this.jatekLista) {
            try {
                System.out.println(this.nev + " Jatekos Konzol: " + this.konzol.getNev() + " Jatekos Skill: " + this.skill + " Jatek konzolTip: "+j.konzolType + " nehezseg: " + j.getNehezseg());

                this.konzol.jatszik(j, this.skill);
                this.skill++;
            } catch (GitGud e) {
                e.printStackTrace();
            } catch (NemTamogatottJatek e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getNev() {
        return this.nev;
    }
}
