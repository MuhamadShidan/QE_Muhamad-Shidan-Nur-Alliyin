import java.util.Scanner;

public class MenghitungLuasdankelilingPersegiPanjang{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);

        int panjang, lebar, keliling, luas;

        System.out.println("Menghitung Luas dan keliling Persegi Panjang");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        System.out.println("Masukan Nilai Panjang :");
        panjang=input.nextInt();
        System.out.println("Masukan Nilai Lebar :");
        lebar=input.nextInt();

        keliling=2*(panjang+lebar);
        luas=panjang*lebar;

        System.out.println("Keliling Persegi Panjang : "+keliling);
        System.out.println("Luas Persegi Panjang : "+luas);

    }
}
