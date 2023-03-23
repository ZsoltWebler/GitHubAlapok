package com.webler._03_21;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Jatek jatek_1 = new Jatek("Bloodborne", 5, "Playstation 4");
        Jatek jatek_2 = new Jatek("Bloodborne", 6, "Playstation 4");
        Jatek jatek_3 = new Jatek("Bloodborne", 7, "Playstation 4");
        Jatek jatek_4 = new Jatek("Bloodborne", 8, "Playstation 4");
        Jatek jatek_5 = new Jatek("Bloodborne", 9, "Playstation 4");

        Konzol konzol = new Playstation();
        Jatekos jatekos = new Jatekos("Szamos",4,konzol, Arrays.asList(jatek_1,jatek_2,jatek_3,jatek_4,jatek_5));
        jatekos.kockul();
    }

}
