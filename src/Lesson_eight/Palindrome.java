package Lesson_eight;

import static java.lang.Character.*;

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

            if (!isLetterOrDigit(leftChar)) {
                left++;
            } else if (!isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (toLowerCase(leftChar) !=
                        toLowerCase(rightChar)) {
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
