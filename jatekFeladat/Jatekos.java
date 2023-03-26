package jatekFeladat;

import java.util.List;

public class Jatekos {
	
	String nev;
	Integer skill;
	Konzol konzol;
	List<Jatek> jatekList;
	
	public Jatekos(String nev, Integer skill, Konzol konzol, List<Jatek> jatek) {
		this.nev = nev;
		this.skill = skill;
		this.konzol = konzol;
		this.jatekList = jatek;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public Integer getSkill() {
		return skill;
	}

	public void setSkill(Integer skill) {
		this.skill = skill;
	}

	public Konzol getKonzol() {
		return konzol;
	}

	public void setKonzol(Konzol konzol) {
		this.konzol = konzol;
	}

	public List<Jatek> getJatek() {
		return jatekList;
	}

	public void setJatek(List<Jatek> jatek) {
		this.jatekList = jatek;
	}
	
	void kockul(){
		for (Jatek jatek : jatekList) {
			try {
				if(jatek.konzolTipus.equals(this.konzol)) {
					jatek.konzolTipus.jatszik(jatek, skill);
				} else {
					throw new NemTamogatottJatek(jatek.nev + " - Nem tamogatott jatek");
				}
			} catch (NemTamogatottJatek | GitGud e) {
				System.out.println("\t" + e);
			}
			
			
		}
	}
	
	

}
