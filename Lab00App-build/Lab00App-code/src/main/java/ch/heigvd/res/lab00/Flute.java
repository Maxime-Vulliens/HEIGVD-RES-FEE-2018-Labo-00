package ch.heigvd.res.lab00;

/**
 * Created by Maxime on 19.02.18.
 */
public class Flute implements IInstrument {

    public Flute() {
    }

    public String play(){
        return "Play Flute";
    }

    @Override
    public int getSoundVolume() {
        return 2;
    }

    @Override
    public String getColor() {
        return null;
    }

}
