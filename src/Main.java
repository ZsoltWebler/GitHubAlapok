import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws IOException {

        List <Jatek> jatekok = new ArrayList<>();

        Konzol konzol = null;

        try (BufferedReader br = new BufferedReader(new FileReader("./src/jatekok.csv"))) {

            String sor;
            String[] ertekek;

            br.readLine();

            while ((sor = br.readLine()) != null) {
                ertekek = sor.split(";");

                if (ertekek[2].equals("XBOX One")) {
                    konzol = new XBOX();
                } else if (ertekek[2].equals("Playstation 5")) {
                    konzol = new Playstation();
                }

                jatekok.add(new Jatek(
                        ertekek[0],
                        Integer.parseInt(ertekek[1]),
                        konzol));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random r = new Random();
        int low = 2;
        int high = 8;
        int result = r.nextInt(high-low) + low;


//        Jatekos j1 = new Jatekos("Nagy Árpi", result, "XBOX One",

    }
}
