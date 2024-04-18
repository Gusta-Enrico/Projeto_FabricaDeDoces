/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class Carrinho {
    
    private List<CarrinhoItem> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(CarrinhoItem item) {
        itens.add(item);
    }
    
     public double calcularPrecoFinal() {
        double precoTotal = 0;
        int descontoTotal = 0;

        for (CarrinhoItem item : itens) {
            precoTotal += item.getDoce().getPreco() * item.getQuantidade();
            descontoTotal += item.getDoce().getPreco() * (item.getQuantidade() - item.getDoce().getBonus());
        }

        return precoTotal - descontoTotal;
    }
}
    
    
    
    
