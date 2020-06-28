package de.fredibenko.ref;

public class App {

    public static void main(String[] args) {
        Erzeuger bauerLustig = ErzeugerFactory.getBetrieb();
        bauerLustig.printBetriebsart();
    }
}
