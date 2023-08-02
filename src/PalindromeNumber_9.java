public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {

        // If x is a negative number it is not a palindrome
        // If x % 10 = 0, in order for it to be a palindrome the first digit should also be 0
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        } else if (x == 0) {
            return true;
        }
     /*   int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        // If x is equal to reversed number then it is a palindrome
        // If x has odd number of digits, dicard the middle digit before comparing with x
        // Example, if x = 23132, at the end of for loop x = 23 and reversedNum = 231
        // So, reversedNum/10 = 23, which is equal to x
        return (x == res || x == res / 10);
        */

        long reversedInt = reverse(x);
        if (x == reversedInt) {
            return true;
        } else {
            return false;
        }
    }

    public static long reverse(long i) {
        String str = Long.toString(i);

        String tmp = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            tmp += str.charAt(j);

        }

        //return Integer.valueOf(tmp);
        return Long.parseLong(tmp);

    }

    public static void main(String[] args) {

        PalindromeNumber_9 obj = new PalindromeNumber_9();
        int x1 = 1211;
        System.out.println(obj.isPalindrome(x1));
        int x2 = 121121;
        System.out.println(obj.isPalindrome(x2));


    }
}


