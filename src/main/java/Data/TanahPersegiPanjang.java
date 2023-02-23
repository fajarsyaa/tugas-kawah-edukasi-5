package Data;

public class TanahPersegiPanjang extends Tanah{
    private double panjang;
    private double lebar;

    public TanahPersegiPanjang(double panjang,double lebar){
        super("persegi panjang");
        this.panjang = panjang;
        this.lebar = lebar;

    }

    @Override
    public double luas(){
        return panjang*lebar;
    }

    @Override
    public double keliling(){
        return 2*(panjang+lebar);
    }
}
