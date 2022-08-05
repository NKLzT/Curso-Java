import java.util.Locale;
import java.util.Scanner;

import Retangulo.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rect = new Retangulo();

        System.out.println("Digite a Altura a Largura do retangulo");
        rect.Altura = sc.nextDouble();
        rect.Base = sc.nextDouble();
        System.out.println("Area = " + rect.Area());
        System.out.println("Perimetro = "+ rect.perimetro());
        System.out.println("Diagonal = "+ rect.diagonal());
        sc.close();
    }
}
