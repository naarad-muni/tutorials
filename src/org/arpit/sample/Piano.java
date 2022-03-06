package org.arpit.sample;

public class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("tin tin tin");
    }

    @Override
    public String getModelNumber() {
        return "gibson";
    }
}
