import java.util.Locale;
import java.util.Scanner;

import Calculadora.Calculadora;

public class App {
   
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Qual o raio?");
        double raio = sc.nextDouble();

        double c = calc.circumferencia(raio);

        double v = calc.volume(raio);

        System.out.println("Circumferencia: "+ c);
        System.out.println("Volume: "+ v);
        System.out.println("Valor de PI: "+ calc.PI);

        sc.close();
    }
    
}
