package Lesson1;

public class Main {
    public static void main(String[] args) {
        /* Task 1*/
        int b = 11;
        int c = 16;
        double a = 4*(b+c-1)/2;
        System.out.println("Result: " + a);

        /*Task 2*/
        int n2 = 98;
        int sum2 = (int) n2/10 + n2%10;
        System.out.println("Result: " + sum2);

        /*Task 3*/
        int n3 = 298;
        int firstNumber = n3/100;
        int secondNumber = (n3/10)%10;
        int thirdNumber = n3%10;
        System.out.print("Result: " + (firstNumber + secondNumber + thirdNumber) );
        System.out.println(" (" + firstNumber + "+" + secondNumber + "+" + thirdNumber + ")");

        /*Task 4*/
        float n4 = (float) 12.5;
        int resultNumber;
        if (n4 >= 0)
            resultNumber = (int) (n4 + 0.5);
        else
            resultNumber = (int) (n4 - 0.5);
        System.out.println("Result: " + resultNumber);

        /*Task 5*/
        int q = 21;
        int w = 8;
        System.out.println("Result: " + q + "/" + w + "=" + q/w + "(остаток " + q%w + ")");

        /*Task **/
        int numberOne = 2;
        int numberTwo = 3;
        numberOne ^= numberTwo;
        numberTwo ^= numberOne;
        numberOne ^= numberTwo;
        System.out.println("Result: " + numberTwo + numberOne);

    }
}
