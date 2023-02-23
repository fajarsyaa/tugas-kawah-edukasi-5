package Data;

public class TanahLingkaran extends Tanah {
    private double PHI = 3.14;
    private double jarijari;
    public TanahLingkaran(double jarijari){
        super("lingkaran");
        this.jarijari = jarijari;
    }

    @Override
    public double luas(){
        return PHI*jarijari*jarijari;
    }

    @Override
    public double keliling(){
        return 2*PHI*jarijari;
    }

}
