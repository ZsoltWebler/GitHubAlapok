package jatekFeladat;

public class Jatek {
	
	String nev;
	Integer nehezsegiSzint;
	Konzol konzolTipus;
	
	public Jatek(String nev, Integer nehezsegiSzint, Konzol konzolTipus) {
		this.nev = nev;
		
		if(nehezsegiSzint < 0) {
			this.nehezsegiSzint = 0;
		} else if(nehezsegiSzint > 10) {
			this.nehezsegiSzint = 10;
		} else {
			this.nehezsegiSzint = nehezsegiSzint;
		}
		
		this.konzolTipus = konzolTipus;
	}
	
	

}
