//package not needed!
//пакет не нужен!

//публичный класс мой первый main
public class BasicTypes {

    public static void main(String[] args) {

        // The byte it is very small integer. It has a minimum value of -128 and a
        // maximum value of 127 (inclusive). It is sometimes used for memory saving
        // reasons.
        byte verySmallNumber = (byte) 127;

        short smallNumber = (short) 32_767;
        // same as:
        smallNumber = (short) 32767;

        // default in Java
        int number = 2_147_483_647;

        // Add L suffix. Use this data type when you need a range of values wider than
        // those provided by int.
        long bigNumber = -9_223_372_036_854_775_808L;

        // Add f suffix. Used for fractions calculations.
        float fractions = 2356_123.1f;

        // Add d suffix. Used for big fractions calculations.
        double bigFranctions = -9_223_372_036_854_775.123_21d;

        // The boolean data type has only two possible values: true and false. Use this
        // data type for simple flags that track true/false conditions.
        boolean likeJava = true;
        likeJava = false;

        // single sign
        char letter = 'c';

        // word or sentence. In reality not a primitive (basic types) but String class
        // instance
        String sayHello = "Hello all! / всем привет!";

        /*
         * 1. Print all those variables to console and check how they are different.
         */

        /*
         * 2. Declare your own five variables and print them out.
         */

    }

}