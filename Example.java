public class Example {
    public static void main(String[] args) {
        // Mistake 1: Incorrect variable declaration and initialization
        int number = "10";
        
        // Mistake 2: Incorrect array initialization
        int[] numbers = new int[5];
        numbers = {1, 2, 3, 4, 5};

        // Mistake 3: Using an undeclared variable
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }

        // Mistake 4: Incorrect method call
        printSum(sum);

        // Mistake 5: Missing semicolon
        System.out.println("Done")

        // Mistake 6: Infinite loop
        while (true) {
            System.out.println("This loop never ends!");
        }

        // Mistake 7: Incorrect typecasting
        double result = (double) sum;

        // Mistake 8: Accessing non-static variable from static context
        System.out.println(number);

        // Mistake 9: Incorrect array index
        System.out.println(numbers[5]);

        // Mistake 10: Unused variable
        int unusedVariable;
    }

    // Mistake 11: Incorrect method signature
    private static void printSum(int s) {
        // Mistake 12: Incorrect print statement
        System.out.printline("Sum is: " + s);
    }
}
