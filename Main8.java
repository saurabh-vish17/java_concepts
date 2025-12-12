package java_concepts;
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args){

        //conditional statement
        // if-else
        Scanner sc= new Scanner(System.in);
        System.out.println("enter you age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are adult now");
        }
        else{
            System.out.println("you are not adult");
        }

        // switch case
        System.out.println("enter day in number ");
        System.out.println("1=monday, 2=tuesday -----------, 7=sunday");
        int day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
                
            default:
                System.out.println("enter wrong number");
                break;
        }

        //unconditional statement

        //break
        System.out.println("this is unconditional statement");
        int n=0;
        while (true) {
            System.out.println(n);
            n++;
            if(n>6){
                break;
            }
        }

        //continue
        int k=0;
        while (true) {
            if(k==3){
                k++;
                continue;
            }
            System.out.println(k);
        }
    }
}
