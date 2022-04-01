package kamionos;

import java.util.Random;

public class Kamionos {

    public static void main(String[] args) {
        
    }
    
    void rakodas(){
    Random rnd = new Random();
    String[] rakomanyok = {"gyümölcs", "zöldség", "kavics", "takarmány", "fa", "homok", "alkohol", "italok",  "édességek", "üzemanyag", "bútor", "ruházat", "vegyszer", "papíráru", "elektronikai cikkek"};
    int rakomanySzam = rnd.nextInt(rakomanyok.length); //Számgenerálás max a több hosszáig.
        //System.out.println(rakomanySzam);
    }
}

// feladatom a következő lenne: 
// 1. random kell generálnom egy számot.. Mondjuk 10.
// A tömb tizedik elemét szeretném lekérdezni vele.

// Most nem vagyok biztos magamba, de gondolkodtam a kiválasztás tételén is, de mivel a szám Integer és a tömb String
// Így fingom sincs hogyan valósíthatnám meg.. Lehet bazira egyszerű, de már egy órája (szüneten kívül) ezen gondolkodok..
