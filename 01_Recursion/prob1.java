public class prob1 {
    static int count = 0;

    static void printName(String name) {
        if (count == 5)
            return;
        System.out.println(name);
        count++;
        printName(name);
        
    }

    public static void main(String[] args) {
        printName("Aayush");
    }
}
