package postfijo;

import java.util.*;

public class ExpTer_Numero implements Expresion {

    private double numero;

    public ExpTer_Numero(Double numero) {
        this.numero = numero;
    }

    @Override
    public void interpretar(Stack<Double> s) {
        s.push(numero);
    }
}
