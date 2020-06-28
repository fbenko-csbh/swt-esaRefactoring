package de.fredibenko.ref;

public abstract class Erzeuger {

    private String betriebsart;

    public String getBetriebsart() {
        return betriebsart;
    }

    public void setBetriebsart(String betriebsart) {
        this.betriebsart = betriebsart;
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

class Milchbetrieb extends Erzeuger {
    Milchbetrieb() {
        setBetriebsart("Milchbetrieb");
    }
}

class Obstbauer extends Erzeuger {
    Obstbauer() {
        setBetriebsart("Obstbauer");
    }
}

class Gaertner extends Erzeuger {
    Gaertner() {
        setBetriebsart("Gaertner");
    }
}

