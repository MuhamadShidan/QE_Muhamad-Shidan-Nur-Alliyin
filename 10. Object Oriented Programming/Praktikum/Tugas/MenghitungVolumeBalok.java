import java.util.Scanner;

public class MenghitungVolumeBalok{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        int panjang, lebar, tinggi;
        double volume;

        System.out.println("Menghitung volume tabung");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        System.out.println("Masukan Nilai panjang :");
        panjang=input.nextInt();
        System.out.println("Masukan Nilai lebar :");
        lebar=input.nextInt();
        System.out.println("Masukan Nilai tinggi :");
        tinggi=input.nextInt();

        volume=panjang*lebar*tinggi;

        System.out.println("Volume : "+volume);

    }
}
