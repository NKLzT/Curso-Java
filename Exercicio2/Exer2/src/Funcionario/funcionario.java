package Funcionario;

public class funcionario {
    public String nome;
    public double salariobruto;
    public double imposto;
    public double salariodesc(){
        return  salariobruto - imposto;
    }
    public void almentarsalario(double porcentagem) {
        salariobruto += salariobruto * porcentagem / 100.0;

    }
    public String toString() {
        return nome + ", $" + salariodesc(); 
    }
}
