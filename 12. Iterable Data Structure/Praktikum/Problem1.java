import java.util.Arrays;

public class Problem1
{
    public static void main(String[] args)
    {
        System.out.println("Merge array");
        System.out.println("Muhamad Shidan Nur Alliyin");
        System.out.println("-----------------------------");

        String[] arr1= {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};
        String[] name = concatArrays(arr1, arr2);
        System.out.println(Arrays.toString(name));
    }
    public static <T> T[] concatArrays(T[] arr1, T[] arr2)
    {
        T[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}