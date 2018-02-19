package ch.heigvd.res.lab00;

/**
 * Created by Maxime on 19.02.18.
 */
public class Clavier implements IInstrument {

    public Clavier() {
    }

    public String play(){
        return "dayyyn";
    }

    @Override
    public int getSoundVolume() {
        return 5;
    }

    @Override
    public String getColor() {
        return "ivory";
    }


}
