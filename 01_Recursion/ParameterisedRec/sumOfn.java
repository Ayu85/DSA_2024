package ParameterisedRec;

public class sumOfn {
    static int getSum(int n, int sum) {
        if (n == 0)
            return sum;
        sum += n;
        n--;
        return getSum(n, sum);

    }

    public static void main(String[] args) {
        System.out.println(getSum(6, 0));
    }
}
