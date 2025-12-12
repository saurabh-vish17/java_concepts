package java_concepts;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        //how to take input

        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println(age);

        //to input string
        String name=sc.nextLine();
        System.out.println(name);

        
    }
}
