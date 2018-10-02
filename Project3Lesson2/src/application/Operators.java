package application;
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
        Example operators = new Example();
        //Exercises operators = new Example();

        operators.assignment();
        operators.multiplicativeAndAdditive();
        operators.logic();
        operators.relational();
        
    }

    
}