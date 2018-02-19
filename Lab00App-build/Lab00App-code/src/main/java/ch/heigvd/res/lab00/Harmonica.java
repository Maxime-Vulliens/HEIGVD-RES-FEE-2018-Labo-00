package ch.heigvd.res.lab00;

/**
 * Created by Maxime on 19.02.18.
 */
public class Harmonica implements IInstrument {

    public Harmonica() {
    }

    public String play(){
        return "dap dap";
    }

    @Override
    public int getSoundVolume() {
        return 1;
    }

    @Override
    public String getColor() {
        return null;
    }
}
