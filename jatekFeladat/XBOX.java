package jatekFeladat;

public class XBOX extends Konzol {

	
	public XBOX(String nev) {
		super(nev);
	}

	@Override
	void jatszik(Jatek jatek, Integer skill) throws GitGud {
		if(jatek.nehezsegiSzint > skill + 2 ) {
			throw new GitGud(jatek.nev + " - Tul alacsony skill");
		} else {
			System.out.println("\t" + jatek.nev + " - vegig jatszva");
		}
	}

}
