import java.util.Scanner;

public class MenghitungluasdankelilingSegitiga{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        int alas, tinggi;
        double keliling, luas;

        System.out.println("Menghitung Luas dan keliling Segitiga");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        System.out.println("Masukan Nilai alas :");
        alas=input.nextInt();
        System.out.println("Masukan Nilai tinggi :");
        tinggi=input.nextInt();

        keliling=alas*tinggi;
        luas=0.5*alas*tinggi;

        System.out.println("Keliling Segitiga : "+keliling);
        System.out.println("Luas Segitiga : "+luas);

    }
}
