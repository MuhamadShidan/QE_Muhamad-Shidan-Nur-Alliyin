import java.util.Scanner;

public class MenghitungVolumeTabung{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        int jari, tinggi;
        double volume;

        System.out.println("Menghitung volume tabung");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        System.out.println("Masukan Nilai jari :");
        jari=input.nextInt();
        System.out.println("Masukan Nilai tinggi :");
        tinggi=input.nextInt();

        volume=3.14*jari*jari*tinggi;

        System.out.println("Volume : "+volume);

    }
}
