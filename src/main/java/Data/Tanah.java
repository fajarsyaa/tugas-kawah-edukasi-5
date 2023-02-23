package Data;

public class Tanah {

    private String JenisBidangTanah;
    public Tanah(String JenisBidangTanah){
        this.JenisBidangTanah = JenisBidangTanah;
    }

    public String getJenisBidangTanah() {
        return JenisBidangTanah;
    }

    public double luas(){
        System.out.println("menghitung luas tanah");
        return 0;
    }

    public double  keliling(){
        System.out.println("menghitung keliling  lingkaran");
        return 0;
    }
}
