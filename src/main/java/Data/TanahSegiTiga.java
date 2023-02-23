package Data;

public class TanahSegiTiga extends Tanah{
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public TanahSegiTiga(double alas,double tinggi,double sisi1,double sisi2){
        super("segi tiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public TanahSegiTiga(double alas,double sisi1,double sisi2){
        super("segi tiga");
        this.alas = alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    public double luas(){
        return (alas*tinggi)/2;
    }

    @Override
    public double keliling(){
        return alas*sisi1*sisi2;
    }

}
