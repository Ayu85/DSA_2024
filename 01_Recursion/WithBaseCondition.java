public class WithBaseCondition {
    static int count = 0;

    static void fun() {
        if (count == 5)
            return;
        System.out.println(count);
        count++;
        fun();

    }

    public static void main(String[] args) {
        fun();
    }
}