package de.fredibenko.ref;

public class App {

    public static void main(String[] args) {
        RemoteApp rApp = new RemoteApp();
        Erzeuger bauerLustig = new Erzeuger(rApp.readFromApp());
        bauerLustig.printBetriebsart();
    }
}
