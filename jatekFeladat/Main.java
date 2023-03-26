package jatekFeladat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
		Konzol xbox = new XBOX("XBOX One");
		Konzol ps = new Playstation("Playstation");
		
		try (BufferedReader br = new BufferedReader(new FileReader("./src/jatekFeladat/jatekok.csv"))) {
			String sor;
			String[] sorElem;
			
			List<Jatek> jatekList = new ArrayList<>(); 

			while ((sor = br.readLine()) != null) {
				sorElem = sor.split(";");
				
				if(sorElem[2].equals("XBOX One")) {
					jatekList.add(new Jatek(sorElem[0], Integer.parseInt(sorElem[1]), xbox));
				} else {
					jatekList.add(new Jatek(sorElem[0], Integer.parseInt(sorElem[1]), ps));
				}
			}
			
			Set<Integer> jatekSetRandom = new Random().ints(0, 9)
					  .distinct()
					  .limit(8)
					  .boxed()
					  .collect(Collectors.toSet());
			
			List<Jatek> jatekListRandom = new ArrayList<>(); 
			
			for(Integer rand : jatekSetRandom) {
				for(int i = 0; i < jatekList.size(); i++) {
					if(rand == i) {
						jatekListRandom.add(jatekList.get(i));
					}
				}
				
			}
			
			
			Integer maxSkill = 7;
			Integer minSkill = 2;
			Integer skillRandom = (int) ((Math.random() * (maxSkill - minSkill)) + minSkill);
			Jatekos jatekos1 = new Jatekos("Peti", skillRandom, xbox, jatekListRandom);
			
			jatekListRandom = new ArrayList<>(); 
			
			
			jatekSetRandom = new Random().ints(0, 9)
					  .distinct()
					  .limit(8)
					  .boxed()
					  .collect(Collectors.toSet());
			
			for(Integer rand : jatekSetRandom) {
				for(int i = 0; i < jatekList.size(); i++) {
					if(rand == i) {
						jatekListRandom.add(jatekList.get(i));
					}
				}
				
			}
			
			skillRandom = (int) ((Math.random() * (maxSkill - minSkill)) + minSkill);
			Jatekos jatekos2 = new Jatekos("Jani", skillRandom, ps, jatekListRandom);
			
			System.out.println("1. jatekos " + jatekos1.nev + ", skill erteke: " + jatekos1.skill + ", " + jatekos1.konzol.nev + " tipusu konzollal jatszik:");
			jatekos1.kockul();
			
			System.out.println();
			
			System.out.println("2. jatekos " + jatekos2.nev + ", skill erteke: " + jatekos2.skill +  ", " + jatekos2.konzol.nev + " tipusu konzollal jatszik:");
			jatekos2.kockul();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
