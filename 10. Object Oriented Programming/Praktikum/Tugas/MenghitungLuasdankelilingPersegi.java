import java.util.Scanner;

public class MenghitungLuasdankelilingPersegi{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        int sisi;
        double luas, keliling;

        System.out.println("Menghitung Luas dan keliling Persegi");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        System.out.println("Masukan Nilai sisi :");
        sisi=input.nextInt();

        keliling=4*(sisi);
        luas=sisi*sisi;

        System.out.println("Keliling Persegi : "+keliling);
        System.out.println("Luas Persegi : "+luas);

    }
}
