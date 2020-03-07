package postfijo;

import java.util.*;

public class ExpTer_Resta implements Expresion {

    @Override
    public void interpretar(Stack<Double> s) {
        double temporal = s.pop();
        s.push(s.pop() - temporal);
    }
}
