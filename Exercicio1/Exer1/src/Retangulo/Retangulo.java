package Retangulo;

public class Retangulo {
    public double Altura;
    public double Base;
    public double resul;
    public double area;

    public double Area(){
        return (Altura * Base);
    }
    public double perimetro(){
        return 2 * (Altura + Base);
    }
    public double diagonal(){
        return Math.sqrt(Altura * Altura + Base * Base);
    }
}
