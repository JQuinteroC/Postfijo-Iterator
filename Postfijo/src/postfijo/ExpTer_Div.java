package postfijo;

import java.util.Stack;

public class ExpTer_Div implements Expresion {

    @Override
    public void interpretar(Stack<Double> s) {
        double temporal = s.pop();
        s.push(s.pop() / temporal);
    }

}
