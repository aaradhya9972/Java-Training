public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            count++;
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nCount = " + count);
    }
}