package Controller;

import java.util.Scanner;

public class Loja {
    
    public static void exibirMenu() {
        System.out.println("Bem-vindo a loja de doces!");
        System.out.println("Produtos disponiveis:");
        int i = 1;
        for (Doce doce : Doce.values()) {
            System.out.println(i + ". " + doce.name() + " - " + doce.getDescricao() + " - R$" + doce.getPreco());
            i++;
        }
    }
    
    public static CarrinhoItem selecionarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecione um produto (ou 's' para sair): ");
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }

        if (opcao < 1 || opcao > Doce.values().length) {
            System.out.println("Opcao invalida!");
            return null;
        }

        Doce doceSelecionado = Doce.values()[opcao - 1];

        System.out.printf("Quantos "+ doceSelecionado.name() +" voce deseja comprar? ");
        int quantidade;
        try {
            quantidade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Quantidade invalida!");
            return null;
        }

        return new CarrinhoItem(doceSelecionado, quantidade);
    }
    
}
