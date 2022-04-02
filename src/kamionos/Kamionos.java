package kamionos;

import java.util.Random;

public class Kamionos {

    public static void main(String[] args) {
        rakodas();
    }

    static void rakodas() {
        Random rnd = new Random();
        String[] rakomanyok = {"gyümölcs", "zöldség", "kavics", "takarmány", "fa", "homok", "alkohol", "italok", "édességek", "üzemanyag", "bútor", "ruházat", "vegyszer", "papíráru", "elektronikai cikkek"};
        int rakomanySzam = rnd.nextInt(rakomanyok.length); //Számgenerálás max a több hosszáig.
        System.out.print("Rakományod a következő: ");
        int i = 0;
        while (i < rakomanyok.length && !(rakomanySzam > 0)) {
            rakomanySzam = rnd.nextInt(rakomanyok.length);
        }
        if (rakomanySzam == 1) {
            System.out.println(rakomanyok[0]);
        } else if (rakomanySzam == 2) {
            System.out.println(rakomanyok[1]);
        } else if (rakomanySzam == 3) {
            System.out.println(rakomanyok[2]);
        } else if (rakomanySzam == 4) {
            System.out.println(rakomanyok[3]);
        } else if (rakomanySzam == 5) {
            System.out.println(rakomanyok[4]);
        } else if (rakomanySzam == 6) {
            System.out.println(rakomanyok[7]);
        } else if (rakomanySzam == 7) {
            System.out.println(rakomanyok[8]);
        } else if (rakomanySzam == 8) {
            System.out.println(rakomanyok[9]);
        } else if (rakomanySzam == 9) {
            System.out.println(rakomanyok[10]);
        } else if (rakomanySzam == 11) {
            System.out.println(rakomanyok[10]);
        } else if (rakomanySzam == 12) {
            System.out.println(rakomanyok[11]);
        } else if (rakomanySzam == 13) {
            System.out.println(rakomanyok[12]);
        } else if (rakomanySzam == 14) {
            System.out.println(rakomanyok[13]);
        } else if (rakomanySzam == 15) {
            System.out.println(rakomanyok[14]);
        } else{
            System.out.println("Jelenleg nincs rakományod, amit elvigyél!");
        }
    }

}

// feladatom a következő lenne: 
// 1. random kell generálnom egy számot.. Mondjuk 10.
// A tömb tizedik elemét szeretném lekérdezni vele.

// Most nem vagyok biztos magamba, de gondolkodtam a kiválasztás tételén is, de mivel a szám Integer és a tömb String
// Így fingom sincs hogyan valósíthatnám meg.. Lehet bazira egyszerű, de már egy órája (szüneten kívül) ezen gondolkodok..
