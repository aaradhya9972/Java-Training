public class ArrayDemo {
    public static void main(String[] args) {

        int[] numbers = {5, 7, 6, 1, 3, 4};
        int[] running = new int[numbers.length];

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            running[i] = sum;
        }

        for (int i = 0; i < running.length; i++) {
            System.out.println("After element " + i + ": sum = " + running[i]);
        }
    }
}