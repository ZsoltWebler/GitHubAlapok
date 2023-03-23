# Órai feladat

1. Készíts egy **Jatek** osztályt! Tárold egy a játék **nevét**,**nehézségi szintjét** (0-10 közötti egész szám,
beállításkor ezt ellenőrizd le. Ha 0-nál kisebb értéket kap, 0 legyen, ha 10-nél nagyobbat, 10 legyen)
Továbbá tárold le azt, hogy a játék milyen **Konzolon**! Hozz létre az adattagoknak megfelelően egy paraméteres konstruktort!
Hozz létre egy **GitGud** és egy **NemTamogatottJatek** nevű kivétel osztályt, melyek
rendelkezzenek egy default és egy paraméteres konstruktorral is!


2. Hozz létre egy **Konzol** nevű, **absztrakt** osztályt! Tárold le a konzol **nevét**, valamint legyen egy absztrakt
**jatszik** metódusa, mely egy **Jatek**, valamint egy **egész szám (skill)** típusú paramétert vár, **GitGud**
és **NemTamogatottJatek** típusú kivételeket dobhat. Készíts egy, az adattagnak
megfelelő paraméteres konstruktort is!


3. Készíts egy **Jatekos** nevű osztályt is! Tárold el a játékos **nevét**, **skilljét** (0-10 közötti egész szám,
beállításkor ezt is ellenőrizd le). Tárolj továbbá egy darab **Konzolt** és egy **Jatek** listát is a játékosnál!
Készíts megfelelő paraméteres konstruktort.
Legyen egy **kockul** metódusa, amely végigmegy a játékos által birtokolt játékokon és mindegyikkel
megpróbál játszani (mindegyikre meghívja a birtokolt **Konzol** **jatek** metódusát). Amennyiben sikeres a
játék (nem dobott kivételt), a játékos **skill**-je növekedjen eggyel. Ellenkező esetben írd ki az alapértelmezett
hibakimenetre, hogy melyik játékos mely játékot nem tudta végigjátszani.


4. Származtass a **Konzol** osztályból egy **XBOX** és egy **Playstation** osztályt is! Mindkettő egy default
konstruktorral rendelkezzen, melyek beállítják a konzol nevét (“XBOX One” vagy “Playstation 5”)!
XBOX esetében a jatek metódus megvalósítása a következő. Megkapja paraméterben a játékot, valamint
a játékos skilljét. Azonban csak azokkal a játékokkal lehet játszani, melyek az adott konzolhoz valóak. Ha
egy játék nem ehhez a konzolhoz való, dobj **NemTamogatottJatek** típusú kivételt! Ellenkező esetben
vizsgáld le, hogy a játékos skillje hogy alakul az aktuális játék nehézségéhez. XBOX esetén olyan játékot képes végigjátszani melynek nehézsége maximum 2-vel nehezebb, mint
a játékos aktuális skillje. Amennyiben nem tudja végigjátszani a játékot, dobj **GitGud** típusú
kivételt!
A játszik metódus az XBOX-hoz hasonlóan működjön,
azonban a játékos csak olyan játékokat tud végigjátszani, melyek nehézségi szintje maximum a játékos
skilljével egyezik meg.


5. Hozz létre egy **jatekok.csv** fájlt, amiben vegyél fel legalább 5-5 játékot mindkét konzolhoz, a játékok adatai pontosvesszővel legyenek elválasztva, pl:


    Grand Theft Auto V;4;XBOX One
    Bloodborne;8;Playstation 5


6. Olvasd be a **jatekok.csv** -t egy listába. Hozz létre két **Jatekos** objektumot egyet Playstation a másikat XBOX konzollal, a **skill** értékük legyen 2-7 közötti random egész szám és a lehetséges játékok listájából
véletlenszerűen rendelj hozzá 8 darab játékot.

7. Hívd meg a mindkét játékos **kockul** metódusát és írd ki melyik játékokat sikerült végigjátszania a konzol kimenetre.

A megoldás során ügyelj a **Clean Code** alapelveinek betartására. Bármilyen külső könyvtárat használhatsz a megoldás során.