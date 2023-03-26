package marc21;

import jan19_JavaSE7_PRACTICE.Auto;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        try (BufferedWriter bw = new BufferedWriter(new
                FileWriter("src/marc21/jatekok.csv"))) {
            bw.write("Grand Theft Auto V;4;XBOX One\n");
            bw.write("Bloodborne;8;Playstation 5\n");
            bw.write("Grand Theft 2 V;6;Playstation 5\n");
            bw.write("Forza Horizon;6;XBOX One\n");
            bw.write("Army of two;7;XBOX One\n");
            bw.write("Halo;9;XBOX One\n");
            bw.write("God of war;7;Playstation 5\n");
            bw.write("Last of us;4;Playstation 5\n");
            bw.write("Uncharted;2;Playstation 5\n");

        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayList<Jatek> jatekok = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader
                ("src/marc21/jatekok.csv"))) {


            String sor;
            String[] ertekek;

            while ((sor = br.readLine()) != null) {
                ertekek = sor.split(";");
                jatekok.add(new Jatek(
                        ertekek[0], // jatek neve
                        Integer.parseInt(ertekek[1]); // jatek szintje
                        Konzol konzol = { new Konzol(ertekek[2])}                        ))
            }



            System.out.println("[Fajl vege]");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
