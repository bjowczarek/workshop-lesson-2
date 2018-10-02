package application;

public class Example {

    /**
     * assignment = += -= *= /= %=
     */
    public void assignment() {
        // assign int value to variable using aprioprate operator
        int variable = 5;
        System.out.println("1. value is: " + variable);

        // check intrasting behaviur. What do you expect?
        variable += 3;
        System.out.println("2. value is: " + variable);

    }

    /**
     * postfix	        expr++ expr--
     * multiplicative	* / 
     * additive	        + -
     */
    public void multiplicativeAndAdditive(){
        
        //look how + and - works
        int sum = 3 + 2;
        System.out.println("sum value is: " + sum);
        int difference = 10 - 1;
        System.out.println("difference value is: " + difference);
        difference = sum - 8;
        System.out.println("difference value is: " + difference);

        //look how / and * works and check difference between "int" and "double"
        double divide = (double)9 / 2;
        System.out.println("divide value is: " + divide);
        int divideInt = 9 / 2;
        System.out.println("divideInt value is: " + divideInt);
        int multiply = sum - 8;
        System.out.println("difference value is: " + multiply);

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

    }

    /**
     * unary ! logical AND && logical OR ||
     */
    public void logic() {

    }

    /**
     * relational < > <= >= equality == !=
     */
    public void relational() {

    }
}