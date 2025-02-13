package TwoPointers;

public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("ABCDABCD"));
    }
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;

        int left = 0;
        int right = s.length() -1;
        while (left <= right){
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

}

