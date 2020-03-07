package postfijo;

import java.util.*;

public class ExpTer_Mult implements Expresion {

    @Override
    public void interpretar(Stack<Double> s) {
        s.push(s.pop() * s.pop());
    }
}
