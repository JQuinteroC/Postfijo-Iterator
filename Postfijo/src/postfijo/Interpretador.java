package postfijo;

import java.util.*;

public class Interpretador {

    private ArrayList<Expresion> operacion = new ArrayList<>();

    public Interpretador(String s) {
        for (String parte : s.split(" ")) {
            switch (parte) {
                case "+":
                    operacion.add(new ExpTer_Suma());
                    break;
                case "-":
                    operacion.add(new ExpTer_Resta());
                    break;
                case "*":
                    operacion.add(new ExpTer_Mult());
                    break;
                case "/":
                    operacion.add(new ExpTer_Div());
                    break;
                default:
                    operacion.add(new ExpTer_Numero(Double.valueOf(parte)));
                    break;
            }

        }
    }

    public Double evaluar() {
        Stack<Double> contexto = new Stack<>();
        for (Expresion ex : operacion) {
            ex.interpretar(contexto);
        }
        return contexto.pop();
    }
}
