package org.arpit.sample;

public class Drum extends Instrument {
    @Override
    public void play() {
        System.out.println("dum da dum da dum");
    }

    @Override
    public String getModelNumber() {
        return "zendaya";
    }
}
