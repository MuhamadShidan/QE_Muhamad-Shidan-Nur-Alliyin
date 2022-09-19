public class Problem2 {

    static int getSingle(int arr[], int n)
    {
        System.out.println("Angka Muncul Sekali");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        int ones = 0, twos = 0;
        int common_bit_mask;

        for (int i = 0; i < n; i++) {

            twos = twos | (ones & arr[i]);

            ones = ones ^ arr[i];

            common_bit_mask = ~(ones & twos);

            ones &= common_bit_mask;

             twos &= common_bit_mask;
        }
        return ones;
    }

     public static void main(String args[])
    {
        int arr[] = { 7, 6, 5, 2, 3, 7, 5, 2 };
        int n = arr.length;
        System.out.println("The element with single occurrence is " + getSingle(arr, n));
    }
}