package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
    System.out.println("Coloque as medidas do triangulo X:");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
    System.out.println("Coloque as medidas do triangulo Y:");
    y.a= sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();
    
    double areaX = x.area();
    double areaY = y.area();

    System.out.println("A area do triangulo X: " + areaX) ;
    System.out.println("A area do triangulo Y: " + areaY) ;
    if(areaX > areaY)
    {
        System.out.println("A maior area do triangulo e a de X ");
    }
    else{
        System.out.println("A maior area do triangulo e a de Y ");
    }
    sc.close();
    }
    
}
