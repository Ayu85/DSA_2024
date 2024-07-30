package ParameterisedRec;

public class Factorial {
    static int getFact(int n, int fact) {
        if (n == 0)
            return fact;

        fact *= n;
        n--;
        return getFact(n, fact);
    }

    public static void main(String[] args) {
        System.out.println(getFact(5, 1));
    }
}
