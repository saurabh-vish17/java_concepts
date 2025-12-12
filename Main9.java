package java_concepts;
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        //looping statement

        //for loop
        System.out.println("printing number by for loop");
        int i;
        for(i=0;i<10;i++){
            System.out.println(i);
        }

        //while loop
        System.out.println("printing number by while loop");
        int j=0;
        while (j<10) {
            System.out.println(j);
            j++;
        }

        //do-while loop
        System.out.println("printing number by for loop");

        int k=0;
         do{
            System.out.println(k);
            k++;
         }
         while(k<10);


         //question : take numbe ras input from user until they enter zero or less than zero 
         Scanner sc=new Scanner(System.in);
         int num=0;
         do{
            System.out.println("enter the number");
            num=sc.nextInt();
            System.out.print("here is your number");
            System.out.println(num);
         }
         while(num>=1);
         System.out.println("thank you");
    }
}
