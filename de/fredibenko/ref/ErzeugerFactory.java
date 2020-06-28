package de.fredibenko.ref;

import java.lang.reflect.InvocationTargetException;

public class ErzeugerFactory {

    public static Erzeuger getBetrieb() {

        RemoteApp rApp = new RemoteApp();


        String betriebsArt = rApp.readFromApp();
        try {
            Erzeuger betrieb = (Erzeuger) Class.forName(betriebsArt).getDeclaredConstructor().newInstance();
            return betrieb;
        } catch(IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}