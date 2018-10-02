package application;

public class Example {

    /**
     * assign = 
     * assign and add +=
     * assigne and subtract -= 
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
     * increment (decrement) by 1 	        expr++ expr--
     * multiply divide                  	* / 
     * add subtract             	        + -
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
     * not            ! 
     * AND            && 
     * OR             ||
     */
    public void logic() {
        boolean truth = true;
        boolean lie = false;
        System.out.println("a truth is " + truth);
        System.out.println("a lie is " + lie);

        System.out.println("######################################");
        System.out.println("##########Bool logic###############");
        System.out.println("######################################");
        System.out.println("########## AND / u ###############");
        System.out.println("true AND false is: " + (true && false));
        System.out.println("false AND true is: " + (false && true));
        System.out.println("true AND true is: " + (true && true));
        System.out.println("false AND false is: " + (false && false));

        System.out.println("########## OR / или ###############");
        System.out.println("true OR false is: " + (true || false));
        System.out.println("false OR true is: " + (false || true));
        System.out.println("true OR true is: " + (true || true));
        System.out.println("false OR false is: " + (false || false));

        System.out.println("########## Not / не ###############");
        System.out.println("not true is: " + (!true));
        System.out.println("not false is: " + (!false));


    }

    /**
     * lower than           < 
     * higher than          > 
     * lower or equal to    <= 
     * higher or equal to   >= 
     * equal to             == 
     * not equal to         !=
     */
    public void relational() {
        System.out.println("######################################");
        System.out.println("##########relational###############");
        System.out.println("######################################");
        System.out.println("5 > 3 is: " + (5 > 3));
        System.out.println("3 >= 10 is: " + (3 >= 10));
        System.out.println("7 < 3 is: " + (7 < 3));
        System.out.println("4 == 4 is " + (4 == 2 + 2));
        System.out.println("4 == 3 is " + (4 == 3));
        System.out.println("4 != 4 is " + (4 != 2 + 2));
        System.out.println("4 != 3 is " + (4 != 3));
    }
}