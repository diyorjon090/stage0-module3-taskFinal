package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first, second, third,fourth;
        first = number / 1000;
        second = number % 1000 / 100;
        third = number % 100 / 10;
        fourth = number % 10;
        System.out.println(first + second + third + fourth);
    }
}
