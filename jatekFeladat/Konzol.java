package jatekFeladat;

public abstract class Konzol {
	
	String nev;
	
	abstract void jatszik(Jatek jatek, Integer skill) throws GitGud;
		
	public Konzol(String nev) {
		this.nev = nev;
	}


}
