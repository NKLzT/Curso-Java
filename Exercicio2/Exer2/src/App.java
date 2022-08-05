import java.util.Locale;
import java.util.Scanner;
import Funcionario.funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        funcionario fun = new funcionario();
        System.out.println("Qual o nome do funcionario?");
        fun.nome = sc.nextLine();
        System.out.println("Qual o salario do funcionario?");
        fun.salariobruto = sc.nextDouble();
        System.out.println("Qual os impostos do funcionario?");
        fun.imposto = sc.nextDouble();
        System.out.println("Funcionario :"+ fun.toString());
        System.out.println("Qual a porcentagem que voce quer aumentar do salario do funcionario?");
        double porcentagem = sc.nextDouble();
        fun.almentarsalario(porcentagem);
        System.out.println("Funcinario atualizado: "+fun);
        
        
        sc.close();
    }
}
