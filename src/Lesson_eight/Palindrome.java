package Lesson_eight;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String inputString1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(inputString1));

        String inputString2 = "raceacar";
        System.out.println(isPalindrome(inputString2));

        String inputString3 = "   ";
        System.out.println(isPalindrome(inputString3));

    }
}
