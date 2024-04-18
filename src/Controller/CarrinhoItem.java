package Controller;


public class CarrinhoItem {
    private Doce doce;
    private int quantidade;

    public CarrinhoItem() {
    }

    
    public CarrinhoItem(Doce doce, int quantidade) {
        this.doce = doce;
        this.quantidade = quantidade;
    }

    public Doce getDoce() {
        return doce;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    
    
}
