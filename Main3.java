package java_concepts;

public class Main3 {
    public static void main(String[] args){

        //strings and it functions in java
        String str1="Hello, World!";
        System.out.println("Original string: "+str1);

        //length() function
        int length=str1.length();
        System.out.println("Length of the string: "+length);

        //concat() function
        String str2=" Welcome to Java programming.";
        String st3=str1+str2;
        System.out.println("Concatenated string: "+st3);

        //charAt() function
        char ch=str1.charAt(7);
        System.out.println("Character at index 7: "+ch);

        //replace() function
        String replacedStr=str1.replace("World","Java");
        System.out.println("Replaced string: "+replacedStr);

        //substring() function
        String substr=str1.substring(7,12);
        System.out.println("Substring from index 7 to 12: "+substr);
    }
    
}
