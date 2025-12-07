package java_concepts;

public class Main2 {
    public static void main(String[] args){
// variable declaration and initialization
        int age=30;
        String school="mvm";
        System.out.println("Age: "+age);
        System.out.println("School: "+school);
//data types in java(primitive and non-primitive)
//primitive data types are: byte, short, int, long, float, double, char, boolean
        byte b=10;
        short s=100;
        int num=30;
        String name="John";
        long phoneNumber=1234567890L;
        float height=5.9F;
        double num2=19.99;
        char grade='A'; 
        boolean isJavaFun=true;
        System.out.println("Byte value: "+b);
        System.out.println("Short value: "+s);
        System.out.println("Integer value: "+num);
        System.out.println("String value: "+name);
        System.out.println("Long value: "+phoneNumber);
        System.out.println("Float value: "+height);
        System.out.println("Double value: "+num2);
        System.out.println("Character value: "+grade);
        System.out.println("Boolean value: "+isJavaFun);
        
//non-primitive data types are: String, Arrays, Classes, Interfaces
        String greeting="Hello, World!";
        int[] numbers={1,2,3,4,5};
        System.out.println("Greeting: "+greeting);
        System.out.print("Array elements: "+numbers[0]+", "+numbers[1]+", "+numbers[2]+", "+numbers[3]+", "+numbers[4]);
            
    }
}
