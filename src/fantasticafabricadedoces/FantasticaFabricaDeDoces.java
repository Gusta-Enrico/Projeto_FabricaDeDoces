/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasticafabricadedoces;

import Controller.Carrinho;
import Controller.CarrinhoItem;
import Controller.Loja;
import java.util.Scanner;


public class FantasticaFabricaDeDoces {


    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        while (true) {
            Loja.exibirMenu();
            CarrinhoItem item = Loja.selecionarProduto();

            if (item == null) {
                continue;
            }

            if (item.getDoce() != null) {
                carrinho.adicionarItem(item);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Deseja adicionar mais itens ao carrinho? (sim/nao): ");
            String continuar = scanner.nextLine().toLowerCase();
            if (!continuar.equals("sim")) {
                break;
            }
        }

        double precoFinal = carrinho.calcularPrecoFinal();
        System.out.printf("Total a pagar: R$" + precoFinal);
    }
}
    

