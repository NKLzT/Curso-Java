import java.util.Locale;
import java.util.Scanner;

import Student.estudante;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        estudante aluno = new estudante();
        System.out.println("Qual o nome do aluno?");
        aluno.nome = sc.nextLine();
        System.out.println("Qual a nota do primeiro semestre do aluno?");
        aluno.semestre1 = sc.nextDouble();
        System.out.println("Qual a nota do segundo semestre do aluno?");
        aluno.semestre2 = sc.nextDouble();
        System.out.println("Qual a nota do terceiro semestre do aluno?");
        aluno.semestre3 = sc.nextDouble();
        System.out.println("Nota Fianl: "+aluno.notafinal());
        if(aluno.notafinal() > 60){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }



        sc.close();
    }
}
