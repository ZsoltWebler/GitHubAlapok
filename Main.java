package Mar21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Jatek> jatekok = new ArrayList<>();
    static List<Jatek> jatekLista1  = new ArrayList<>();
    static List<Jatek> jatekLista2  = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        String sor;
        String[] params;

        BufferedReader br = new BufferedReader(new FileReader("src/Mar21/jatekok.csv"));

        while ((sor = br.readLine()) != null) {
            params = sor.split(";");
            jatekok.add(new Jatek(params[0], Integer.parseInt(params[1]), params[2]));
        }

        jatekLista1 = generateJatekLista();
        jatekLista2 = generateJatekLista();

//        System.out.println("jatekLista1");
//        printOutJatekLista(jatekLista1);
//
//        System.out.println("\njatekLista2 ");
//        printOutJatekLista(jatekLista2);

        Konzol xbox = new XBOX();
        Jatekos jani = new Jatekos("Jani", 5, xbox, jatekLista1);

        Konzol playstation = new Playstation();
        Jatekos feri = new Jatekos("Feri", 6, playstation, jatekLista2);

        System.out.println("\nAz alabbi jatekokkal jatszott " + jani.nev + "(" + jani.skill + ")" + ":");
        jani.kockul();
        System.out.println(jani.nev + " skillje a jatek vegen: " + jani.skill );

        System.out.println("\nAz alabbi jatekokkal jatszott " + feri.nev + "(" + feri.skill + ")" + ":");
        feri.kockul();
        System.out.println(feri.nev + " skillje a jatek vegen: " + feri.skill );
    }

    public static int getRandomInt() {
        return  (int) (Math.random() * jatekok.size());
    }

    public static List<Jatek> generateJatekLista() {
        int random;
        List<Jatek> jatekLista  = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            random  = getRandomInt();
            if (!jatekLista.contains(jatekok.get(random))) {
                jatekLista.add(jatekok.get(random));
            } else {
                i--;
            }
        }
        return jatekLista;
    }
    public static void printOutJatekLista(List<Jatek> jatekLista) {
        for(int i = 0; i < jatekLista.size(); i++) {
            System.out.println((i + 1) + ". " + jatekLista.get(i).getNev());
        }
    }
}
