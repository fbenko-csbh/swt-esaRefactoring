package de.fredibenko.ref;

public class Erzeuger {

    private String betriebsart;

    public Erzeuger(String betriebsart) {
        this.betriebsart = betriebsart;
    }

    public String getBetriebsart() {
        return betriebsart;
    }

      public void printBetriebsart() {
        for(int i=0; i<33; i++) {System.out.printf("-");}
        System.out.println();
        System.out.println("*** Mein Bauernhof ***");
        System.out.println("---Detailsübersicht---");
        for(int i=0; i<33; i++) {System.out.printf("-");}
        System.out.println();
        System.out.printf("%-20s%s\n", "Betriebsart:", getBetriebsart());
    }
}


