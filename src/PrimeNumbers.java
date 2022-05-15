public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 2;
        boolean isPrime = true;
        while (num <= 100) {
            int num_sqrt = (int) Math.sqrt(num) + 1;
            for (int i = 2; i < num_sqrt; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) System.out.print(num + ",");
            num++;
        }
    }
}
