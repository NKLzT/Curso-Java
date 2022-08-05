package Aplicativo;

import java.util.Locale;
import java.util.Scanner;

import Produto.Produto;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
    Produto produto = new Produto();
    System.out.println("Coloque os dados do produto: ");
    System.out.print("Nome: ");
    produto.nome = sc.nextLine();
    System.out.print("Preço: ");
    produto.preço = sc.nextDouble();
    System.out.print("Quantidade: ");
    produto.quantidade = sc.nextInt();

    System.out.println(produto);

    System.out.println("Quantos itens adicionar no estoque");
    produto.quantidade += sc.nextInt();
    System.out.println(produto);

    System.out.println("Quantos itens remover no estoque");
    produto.quantidade -= sc.nextInt();
    System.out.println(produto);

     sc.close();
    }
}