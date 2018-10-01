/*
    Operators	            Precedence
    postfix	                expr++ expr--
    unary	                ++expr --expr +expr -expr ~ !
    multiplicative	        * / %
    additive	            + -
    shift	                << >> >>>
    relational	            < > <= >= instanceof
    equality	            == !=
    bitwise AND	            &
    bitwise exclusive OR    ^
    bitwise inclusive OR	|
    logical AND	            &&
    logical OR	            ||
    ternary	                ? :
    assignment	            = += -= *= /= %= &= ^= |= <<= >>= >>>= 
 */
public class Operators {

    public static void main(String[] args) {
        
        
    }

    /**
     * assignment    = += -= *= /= %= 
     */
    private static void assignment(){
        //assign int value to variable using aprioprate operator
        int variable = 5;
        System.out.println("1. value is: "+variable);

        //check intrasting behaviur. What do you expect?
        variable += 3;
        System.out.println("2. value is: "+variable);

        //try on your own:
        variable *= 2;
        System.out.println("3. value is: "+variable);

        variable *= 4;
        System.out.println("4. value is: "+variable);

        variable *= 3;
        System.out.println("5. value is: "+variable);

    }

    /**
     * postfix	        expr++ expr--
     * multiplicative	* / 
     * additive	        + -
     */
    private static void multiplicativeAndAdditive(){
        
        //look how + and - works
        int sum = 3 + 2;
        System.out.println("sum value is: " + sum);
        int difference = 10 - 1;
        System.out.println("difference value is: " + difference);
        difference = sum - 8;
        System.out.println("difference value is: " + difference);

        //try on your own. Insert operator to obtain expected value
        int test1 = 7  2;
        System.out.println("test1 value is (expected 9): " + test1);
        int test2 = 6  2;
        System.out.println("test2 value is (expected 4): " + test2);
        test2 = test1  test2;
        System.out.println("test2 value is (expected 5): " + test2);

        //look how / and * works and check difference between "int" and "double"
        double divide = 9 / 2;
        System.out.println("divide value is: " + divide);
        int divideInt = 9 / 2;
        System.out.println("divideInt value is: " + divideInt);
        int multiply = sum - 8;
        System.out.println("difference value is: " + difference);

        //try on your own. Insert operator to obtain expected value
        int test3 = 6  2;
        System.out.println("test3 value is (expected 3): " + test3);
        int test4 = test3  3;
        System.out.println("test4 value is (expected 9): " + test4);
        double test5 = 9  2;
        System.out.println("test5 value is (expected 4.5): " + test5);

         //look how ++ and -- works. Note ++ and -- change variable value for NEXT line of code.
         int variable = 6;
         System.out.println("variable value is: " + variable);
         variable++;
         System.out.println("variable value is 7? " + variable);
         System.out.println("variable value is 8? " + variable++);
         System.out.println("variable value is 8? " + variable);

         variable = 10;
         System.out.println("variable value is: " + variable);
         variable--;
         System.out.println("variable value is 9? " + variable);
         
         //try on your own.
         int myOwn = 10;

    }

    /**
     * unary            ! 
     * logical AND      && 
     * logical OR       ||
     */
    private static void logic(){

    }

    /**
     * relational       < > <= >= 
     * equality         == != 
     */
    private static void relational(){

    }
}