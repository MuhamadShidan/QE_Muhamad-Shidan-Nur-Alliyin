import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choice, result= 0;

        System.out.println("Kalkulator alterra academy");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-------------------------");

        System.out.println("Masukan Angka Pertama ");
        numbers1 = input.nextInt();
        System.out.println("Masukan Angka Kedua ");
        numbers2 = input.nextInt();

        System.out.println("Masukan Operasi ");
        choice = input.nextInt();

        switch (choice)
        {
            case 1 : result = numbers1 + numbers2; break;
            case 2 : result = numbers1 - numbers2; break;
            case 3 : result = numbers1 / numbers2; break;
            case 4 : result = numbers1 * numbers2; break;
            case 5 : result = numbers1 % numbers2; break;
            default : System.out.println("Salah masukan pilihan, harap baca dimenu");
        }
        System.out.println("Hasil: " + result);

    }
}
