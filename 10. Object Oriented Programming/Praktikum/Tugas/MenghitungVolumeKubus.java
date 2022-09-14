import java.util.Scanner;

public class MenghitungVolumeKubus{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        int sisi;
        double volume;

        System.out.println("Menghitung volume kubus");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        System.out.println("Masukan Nilai sisi :");
        sisi=input.nextInt();

        volume=sisi*sisi*sisi;

        System.out.println("Volume : "+volume);

    }
}
