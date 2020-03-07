package postfijo;

import java.util.*;

public class ExpTer_Suma implements Expresion {

    @Override
    public void interpretar(Stack<Double> s) {
        s.push(s.pop() + s.pop());
    }
}
