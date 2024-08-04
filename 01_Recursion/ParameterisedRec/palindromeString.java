package ParameterisedRec;

public class palindromeString {
    static boolean checkStr(String str, int start, int end) {
        while (start < end ) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            else
                return checkStr(str, start + 1, end - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkStr("civic", 0, 3));
    }
}
