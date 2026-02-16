package Lesson11;

public class PalindromeChecker {

    static public boolean isPalindrome(String line, int wordNumber) {
        String[] mas = line.split(" ");
        if (wordNumber > mas.length) {
            System.out.println("Error");
            return false;
        }
        for (int start = 0, end = mas[wordNumber-1].length()-1; start < end; start++, end--) {
            if (mas[wordNumber-1].charAt(start) != mas[wordNumber-1].charAt(end))
                return false;
        }
        return true;
    }
}
