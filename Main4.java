package java_concepts;

public class Main4 {
    public static void main(String[] args){
        //array declaration and initialization

        int[] array1=new int[5]; //declaration with size
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        System.out.println("Element at index 2: "+array1[2]);//accessing element

        int[] numbers={12,10,4,2,50};//declaration with values 
        System.out.println("Element at index 3: "+numbers[3]);//accessing element

        int[] number1=new int[3];//making empty array with size 3
        System.out.println(number1[0]);//default value 0 for int type
        

        //properties of array

        //length property
        System.out.println("Length of numbers array: "+numbers.length);//length property\
        //we not use parentheses with length as it is not a method 

        //sorting an array elements
        java.util.Arrays.sort(numbers);//importing Arrays class from java.util package
        System.out.println("Sorted array: ");
        System.out.println(numbers[1]);//accessing element after sorting
        

        //2D array
        int[][] array2D={{1,2,3},{4,5,6},{7,8,9}}; //declaration and initialization of 2D array
        System.out.println("Element at row 2, column 3: "+array2D[1][2]);//accessing element at row 2, column 3
    }
}
