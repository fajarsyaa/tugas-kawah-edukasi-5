package Data;

public class TanahPersegi extends Tanah {
    private double sisi;

    public TanahPersegi(double sisi){
        super("persegi");
        this.sisi = sisi;
    }

    @Override
    public double luas(){
        return sisi*sisi;
    }

    @Override
    public double keliling(){
        return 4*sisi;
    }
}
