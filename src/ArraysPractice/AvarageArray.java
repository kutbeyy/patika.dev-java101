package ArraysPractice;

public class AvarageArray {
    public static double calcAvarage(double[] arr) {
        int sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return (sum) / (double) (arr.length);
    }


    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 10, 13};
        System.out.println(calcAvarage(numbers));
    }
}
