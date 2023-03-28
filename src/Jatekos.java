import java.util.List;

public class Jatekos {

    String jatekosNeve;
    int skill;

    Konzol konzol;

    List <Jatek> jatekok;

    public Jatekos(String jatekosNeve, int skill, Konzol konzol, List<Jatek> jatekok) {
        this.jatekosNeve = jatekosNeve;
        this.skill = skill;
        this.konzol = konzol;
        this.jatekok = jatekok;
    }

    public String getJatekosNeve() {
        return this.jatekosNeve;
    }

    public void setJatekosNeve(String jatekosNeve) {
        this.jatekosNeve = jatekosNeve;
    }

    public int getSkill() {
        return this.skill;
    }

    public Konzol getKonzol() {
        return this.konzol;
    }

    public void setKonzol(Konzol konzol) {
        this.konzol = konzol;
    }

    public List<Jatek> getJatekok() {
        return this.jatekok;
    }

    public void setJatekok(List<Jatek> jatekok) {
        this.jatekok = jatekok;
    }

    public void setSkill(int skill) {
        if (skill < 0 || skill > 10) {
            this.skill = -1;
            System.out.println("Hiba! 0 és 10 közötti számot adj meg!");
        }
    }

//    public List<Jatek> kockul() {

//    }
}

