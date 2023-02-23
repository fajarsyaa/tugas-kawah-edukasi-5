package KawahEdukasi;

import Data.TanahLingkaran;
import Data.TanahPersegi;
import Data.TanahPersegiPanjang;
import Data.TanahSegiTiga;

public class App 
{
    public static void main( String[] args )
    {
        TanahPersegi tanah1 = new TanahPersegi(5);
        System.out.println("Jenis Bidang Tanah = "+tanah1.getJenisBidangTanah());
        System.out.println("luas tanah : "+tanah1.luas());
        System.out.println("keliling tanah : "+tanah1.keliling());
        System.out.println("----------------------------------------------------------------------");

        TanahPersegiPanjang tanah2 = new TanahPersegiPanjang(10,5);
        System.out.println("Jenis Bidang Tanah = "+tanah2.getJenisBidangTanah());
        System.out.println("luas tanah : "+tanah2.luas());
        System.out.println("keliling tanah : "+tanah2.keliling());
        System.out.println("----------------------------------------------------------------------");

        TanahSegiTiga tanah3 = new TanahSegiTiga(10,7,8,9);
        System.out.println("Jenis Bidang Tanah = "+tanah3.getJenisBidangTanah());
        System.out.println("luas tanah : "+tanah3.luas());
        System.out.println("keliling tanah : "+tanah3.keliling());
        System.out.println("----------------------------------------------------------------------");

        TanahLingkaran tanah4 = new TanahLingkaran(7);
        System.out.println("Jenis Bidang Tanah = "+tanah4.getJenisBidangTanah());
        System.out.println("luas tanah : "+tanah4.luas());
        System.out.println("keliling tanah : "+tanah4.keliling());
        System.out.println("----------------------------------------------------------------------");
    }
}
