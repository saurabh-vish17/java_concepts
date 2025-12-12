package java_concepts;

public class Main10 {
    //creating method 
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void printname(String name) {
        System.out.println("your name is "+name);
        
    }
    public static void twosum(int a,int b) {
        int sum=a+b;
        System.out.println("sum of the given number is "+sum);
    }
    public static void main(String[] args) {
        //calling method
        printHello();
        printHello();
        printHello();

        printname("saurabh");

        twosum(5, 20);
        
    }
}
