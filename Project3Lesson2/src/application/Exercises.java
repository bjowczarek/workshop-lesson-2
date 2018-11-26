package application;

public class Exercises {

    /**
     * assignment = += -= *= /= %=
     */
    private static void assignment() {
        // assign int value to variable using aprioprate operator
        int variable = 5;
        
        // try on your own:
        variable 2;
        System.out.println("3. value is: " + variable);

        variable 4;
        System.out.println("4. value is: " + variable);

        variable 3;
        System.out.println("5. value is: " + variable);

    }

    /**
     * postfix          expr++ expr--
     * multiplicative   * / 
     * additive         + -
     */
    private static void multiplicativeAndAdditive(){
        
        //try on your own. Insert operator to obtain expected value
        int test1 = 7  2;
        System.out.println("test1 value is (expected 9): " + test1);
        int test2 = 6  2;
        System.out.println("test2 value is (expected 4): " + test2);
        test2 = test1  test2;
        System.out.println("test2 value is (expected 5): " + test2);

        //try on your own. Insert operator to obtain expected value
        int test3 = 6  2;
        System.out.println("test3 value is (expected 3): " + test3);
        int test4 = test3  3;
        System.out.println("test4 value is (expected 9): " + test4);
        double test5 = 9  2;
        System.out.println("test5 value is (expected 4.5): " + test5);
         
        //try on your own using ++ and --.
        int myOwn = 10;
        System.out.println("myOwn value is: " + variable);
         

    }
    /**
     * not ! AND && OR ||
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
        System.out.println("########## OR / или ###############");
        System.out.println("expected is false: " + (true  false));
        System.out.println("expected is true: " + (false true));
        System.out.println("expected is true: " + (true true));
        System.out.println("expected is false: " + (false false));
        System.out.println("expected is true: " + (true  false));

        System.out.println("########## Not / не ###############");
        System.out.println("expected is true: " + !(3<5));
        System.out.println("expected is false:  " + (8>=3+5));

    }

    /**
     * lower than < higher than > lower or equal to <= higher or equal to >= equal
     * to == not equal to !=
     */
    public void relational() {
        System.out.println("######################################");
        System.out.println("##########relational###############");
        System.out.println("######################################");
        System.out.println("expected is true: " + (9  10));
        System.out.println("expected is true: " + (11  8));
        System.out.println("expected is true: " + (2 5));
        System.out.println("expected is true: " + (7  2+10));
        System.out.println("expected is false: " + (0 -10));
        System.out.println("expected is false: " + (1.5  2 + 2));
        System.out.println("expected is false: " + (true  false));
        System.out.println("expected is false: " + (4_100  31_234));
    }


}