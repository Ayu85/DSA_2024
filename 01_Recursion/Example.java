public class Example{
    // this will run infinite as no base condition is specified
    static void fun(){
        System.out.println("Function running");
        fun();

    }
    public static void main(String[] args){
        fun();
    }
}