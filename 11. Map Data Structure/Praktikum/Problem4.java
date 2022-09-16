public class Problem4 {

    public static void printDistinct(int arr[], int n)
    {
        System.out.println("Remove Duplicates");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        for (int i = 0; i < n; i++)
        {

            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }

    public static void main (String[] args)
    {
        int arr[] = {1, 2, 3, 4, 1, 3, 5, 10, 16};
        int n = arr.length;
        printDistinct(arr, n);

    }
}