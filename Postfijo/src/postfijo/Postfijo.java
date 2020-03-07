package postfijo;

import java.util.Scanner;

public class Postfijo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Escribe tu expresión polaca (por ejemplo '2 5 7 1 * / +')");
        String operacion = scn.nextLine() ;
        System.out.println(new Interpretador(operacion).evaluar());
    }
}
