import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jatek> games = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/jatekok.csv"))) {
            String line;
            String[] values;
            ArrayList<Jatek> data = new ArrayList<>();
            Konzol console = null;

            while ((line = br.readLine()) != null) {
                values = line.split(";");

                if (values[2].equals("XBOX One")) {
                    console = new XBOX();
                } else if (values[2].equals("Playstation 5")) {
                    console = new Playstation();
                }

                data.add(new Jatek(
                        values[0],
                        Integer.parseInt(values[1]),
                        console
                ));
            }

            games = data;
        } catch (IOException e) {
            System.err.println("Fájl betöltése sikertelen!");
            e.printStackTrace();
        }

        List<Jatek> gameList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, games.size());
            gameList.add(games.get(random));
            games.remove(random);
        }
        games.addAll(gameList);

        Jatekos jatekos1 = new Jatekos("Teszt Elek",
                ThreadLocalRandom.current().nextInt(2, 8),
                new Playstation(),
                gameList
        );

        gameList.clear();

        for (int i = 0; i < 8; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, games.size());
            gameList.add(games.get(random));
            games.remove(random);
        }
        games.addAll(gameList);

        Jatekos jatekos2 = new Jatekos("Akciós Áron",
                ThreadLocalRandom.current().nextInt(2, 8),
                new XBOX(),
                gameList
        );
    }
}
