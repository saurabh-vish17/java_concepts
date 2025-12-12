package java_concepts;

import java.util.Scanner;

public class MiniProject {
    //creating game of guessing random number 
    public static void main(String[] args) {
        System.out.println("welcome to game world");
        System.out.println("let play guessing the the number");
        System.out.println("to exit enter negative number");

        Scanner sc=new Scanner(System.in);
        //generating random number
        //Math.random() generates a number 
        int Randomnum=(int)(Math.random()*100);
        int usernumber=0;

        do{
            System.out.println("guess the number(1-100):");
            usernumber=sc.nextInt();

            if(usernumber>Randomnum){
                System.out.println("number is too large");
            }

            else if(usernumber<Randomnum){
                System.out.println("number is too small"); 
            }
            else{
                System.out.println("well done.... you are correct");
                System.out.println("the random number is "+Randomnum);
                break;
            }
        }while (usernumber>=0);
    }
    
}
