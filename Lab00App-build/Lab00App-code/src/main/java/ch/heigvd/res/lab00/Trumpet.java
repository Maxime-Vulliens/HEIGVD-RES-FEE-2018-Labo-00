package ch.heigvd.res.lab00;

/**
 * Created by Maxime on 19.02.18.
 */
public class Trumpet implements IInstrument {

    public Trumpet() {
    }

    public String play(){
        return "pouet";
    }

    public int getSoundVolume(){
        return 10;
    }

    @Override
    public String getColor() {
        return "golden";
    }

}
