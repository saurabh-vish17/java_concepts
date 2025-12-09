package java_concepts;

public class Main5 {
    public static void main(String[] args){
        //casting in java
        //implicit casting(convert smaller data type to larger one)
        int a=10; 
        double b=68.00;
        double c=a+b;
        System.out.println(c);

        //explicit casting (convert larger data type in smaller one)
        double d=20.00;
        int e=(int)d;
        System.out.println(e);
    }


    //constant in java
    final int constantValue=100;//constant declaration using final keyword
    //constantValue=200; //this will give error as we cannot change value of constant
    //constantValue can be accessed within the class using object
    //but cannot be modified

    
}
