package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int intValue=37;
        double doubleValue=intValue;
        System.out.println("Int value: "+intValue);
        System.out.println("Double value: "+doubleValue);



        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        double doubleValue2 =9.78;
        int castDoubleToInt = (int) doubleValue2;
        System.out.println("Double value: "+doubleValue2);
        System.out.println("Int value from casting double value: "+castDoubleToInt);


        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        int num=65;
        char c = (char)num;
        System.out.println("The char corresponding to number "+num+" is "+c);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char z='Z';
        int charToInt= (int)z;
        System.out.println("The char "+z+" correspond to ASCII value "+charToInt);

        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String val="42";
        int convertToInt= Integer.parseInt(val);
        System.out.println("La conversion du String "+val+" en int donne "+convertToInt);


        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        String convertToString= String.valueOf(convertToInt);
        System.out.println(convertToString);

    }
}
