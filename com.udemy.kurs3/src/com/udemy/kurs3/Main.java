package com.udemy.kurs3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	int trainingsrunde = 0;

       Vokabel v1 = new Vokabel("Hund","dog");
      
       
       Vokabel v2 = new Vokabel("Katze","cat");
       
       Vokabelliste vokabeln = new Vokabelliste(10);
       vokabeln.addVokabel(v1);
       vokabeln.addVokabel(v2);
       
       int index = 2;
       
        System.out.println("Willkommen zum Vokabeltrainer!");

        System.out.println("Neue Vokabel(n), neues Training(t), Statistik anzeigen(s), Beenden(x)");

        String  eingabe;

        Scanner sc = new Scanner(System.in);

        eingabe = sc.next();

        while(!eingabe.equals("x")){
        	
        	
        	
        if(eingabe.equals("t")) {
        	
        	System.out.println("Trainingsmodus: Einprägen(1), Abfragen(2),Buchstabe(3)");
        	
        	int modus = Integer.parseInt(sc.next());
        	
        	Vokabel [] vok = vokabeln.getVokabeln();
        	
        	if(modus == 1) {
        		
        		
        		
        		TrainingstypLernen t1 = new TrainingstypLernen();
        		t1.trainiere(vok);
        		
        		
        	}
        	
        	if(modus == 2) {
        	
        		TrainingstypAbfragen t2 = new TrainingstypAbfragen();
        		t2.trainiere(vok);
        }
        	
        	
        	if(modus == 3) {
            	
        		TrainingstypBuchstabe t2 = new TrainingstypBuchstabe();
        		t2.trainiere(vok);
        }
        	
        }
        
        if(eingabe.equals("n")) {
        	
        	
        	System.out.println("Vokabel deutsch");
        	String vd = sc.next();
        	
        	System.out.println("Vokabel englisch");
        	String ve = sc.next();
        	
        	Vokabel v = new Vokabel(vd,ve);
        	vokabeln.addVokabel(v);
        	
        	
        }
        
        
        if(eingabe.equals("s")) {
        	
        	Vokabel [] vs = vokabeln.getVokabeln();
        	for(int i=0;i<vs.length;i++) {
        		System.out.println(vs[i].getVokabelDeutsch());
        		System.out.println(vs[i].getErfolgsquote());
        		System.out.println("/");
        	}
        }
        	
        System.out.println("Neue Vokabel(n), neues Training(t),Statistik anzeigen(s), Beenden(x)");
        	
        	eingabe = sc.next();
        
        
        }
        
    }
}
        
       

            
    
    
    




