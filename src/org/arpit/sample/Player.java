package org.arpit.sample;

public class Player {
    public static void main(String[] args) {
        Piano p = new Piano();
        Drum d = new Drum();
        Cello c = new Cello();
        Instrument i;
        p.play();
        d.play();
        c.play();
        i = c;
        System.out.println(i.getModelNumber());
    }
}
