package feladatIllesVanessza;

import java.util.List;

public class Jatekos {

    private String jatekosNeve;
    private int skill;
    private Konzol konzol;

    private List<Jatek> jatekok;

    public Jatekos(String jatekosNeve, int skill, Konzol konzol, List<Jatek> jatekok) {
        this.jatekosNeve = jatekosNeve;
        this.skill = skill;
        this.konzol = konzol;
        this.jatekok = jatekok;
    }

    public void kockul() {
        for (Jatek jatek : jatekok ) {
            try {
                this.konzol.jatszik(jatek, this.skill);
                System.out.println("Sikerült végigjátszanod: " + jatek.getJatekNeve());
                this.skill += 1;
            }
            catch (GitGud | NemTamogatottJatek exception){
                System.out.println(this.jatekosNeve + " " + jatek.getJatekNeve() + "-t nem tudta végigjátszani.");
            }
        }
    }

    public String getJatekosNeve() {
        return jatekosNeve;
    }

    public void setSkill(int skill) {
        if(skill < 0){
            this.skill = 0;
        } else if (skill > 10) {
            this.skill = 10;
        } else {
            this.skill = skill;
        }
        this.skill = skill;
    }
}
