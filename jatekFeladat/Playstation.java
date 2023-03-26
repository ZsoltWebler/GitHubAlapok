package jatekFeladat;

public class Playstation extends Konzol {

	public Playstation(String nev) {
		super(nev);
	}

	@Override
	void jatszik(Jatek jatek, Integer skill) throws GitGud {
		if(jatek.nehezsegiSzint > skill) {
			throw new GitGud(jatek.nev + " - Tul alacsony skill");
		} else {
			System.out.println("\t" + jatek.nev + " - vegig jatszva");
		}
	}

}
