package FastAndSlowPointer;

public class F01HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }
    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = sumOfSquaredDigits(n);

        while (slow != fast){
            slow = sumOfSquaredDigits(slow);
            fast = sumOfSquaredDigits(sumOfSquaredDigits(fast));
        }

        return slow == 1;
    }

    public static int sumOfSquaredDigits(int number) {
        int totalSum = 0;
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            totalSum += digit * digit;
        }
        return totalSum;
    }
}
