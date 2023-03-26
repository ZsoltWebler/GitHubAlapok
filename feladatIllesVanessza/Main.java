package feladatIllesVanessza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Jatek> jatekok = new ArrayList<>();


        try {
            BufferedReader bR = new BufferedReader(new FileReader("src/feladatIllesVanessza/jatekok.csv"));

            String sor;
            String[] ertekek;
            while ((sor = bR.readLine()) != null) {

                ertekek = sor.split(";");

                jatekok.add(new Jatek(ertekek[0], Integer.parseInt(ertekek[1]), ertekek[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        Jatekos player1 = new Jatekos("Otto", random.nextInt(7 - 2 + 1) + 2, new PlayStation(), jatekosLista(jatekok));
        Jatekos player2 = new Jatekos("Hanna", random.nextInt(7 - 2 + 1) + 2, new XBox(), jatekosLista(jatekok));

        System.out.println("Most " + player1.getJatekosNeve() + " játszik");
        player1.kockul();
        System.out.println();
        System.out.println("Most " + player2.getJatekosNeve() + " játszik");
        player2.kockul();
    }

    public static List<Jatek> jatekosLista(List<Jatek> jatekok) {
        Random random2 = new Random();
        int max = jatekok.size() - 1;

        List<Jatek> randomJatekok = new ArrayList<>();
        while (randomJatekok.size() < 8) {
            int index = random2.nextInt(max);
            Jatek jatek = jatekok.get(index);

            if (randomJatekok.isEmpty() || !randomJatekok.contains(jatek)) {
                randomJatekok.add(jatek);
            }
        }
        return randomJatekok;
    }
}
