public class Main {
    public static void main(String[] args) {
        // Deliberate NullPointerException
        String str = null;
        System.out.println(str.length());

        // Deliberate ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);

        // Deliberate NumberFormatException
        String invalidNumber = "abc";
        Integer.parseInt(invalidNumber);

        // Deliberate ArithmeticException
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }
}
