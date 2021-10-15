package com.udemy.kurs3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String vokabel_deutsch = "Hund";
        String vokabel_englisch = "dog";

        System.out.println("Willkommen zum Vokabeltrainer!");

        System.out.println("Neue Trainingsrunde? (ja/nein)");

        String neue_runde = "nein";

        Scanner sc = new Scanner(System.in);

        neue_runde = sc.next();

        while(neue_runde.equals("ja")){

            System.out.println(vokabel_deutsch);

            System.out.println("Gib die Übersetzung ein:");

            String uebersetzung = sc.next();

            if(uebersetzung.equals(vokabel_englisch)){

                System.out.println("Das ist richtig!");

            }else{

                System.out.println("Das ist falsch!");
            }

            System.out.println("Neue Trainingsrunde? (ja/nein)");
            neue_runde = sc.next();
        }
    }



}
