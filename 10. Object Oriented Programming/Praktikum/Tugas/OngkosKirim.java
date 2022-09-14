import java.util.Scanner;

public class OngkosKirim{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        int Panjang, lebar, tinggi;
        double volume, ongkir, hasil;

        System.out.println("Menghitung Ongkos Kirim");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        System.out.println("Masukan Nilai Panjang :");
        Panjang=input.nextInt();
        System.out.println("Masukan Nilai Lebar :");
        lebar=input.nextInt();
        System.out.println("Masukan Nilai Tinggi :");
        tinggi=input.nextInt();

        volume=Panjang*lebar*tinggi;
        ongkir=volume/1000*5000;
        hasil=ongkir/volume*1000;


        System.out.println("volume : "+volume);
        System.out.println("ongkir : "+ongkir);
        System.out.println("hasil : "+hasil);

    }
}

