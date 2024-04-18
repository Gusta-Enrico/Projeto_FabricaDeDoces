package Controller;


public enum Doce {
    
    CHOCOLATES(3.5, "doce de cacau", 3, 1),
    BRIGADEIROS(6.0, "brigadeiro de chocolate meio amargo", 4, 1),
    BOMBONS(1.50, "bombom recheado", 5, 3),
    BARRINHAS(4.0, "barrinha de chocolate", 2, 1),
    BALAS(0.5, "bala de iogurte", 5, 3);
    
    private double preco;
    private String descricao;
    private int compraMinima;
    private int bonus;

    private Doce() {
    }
    
    
    
    Doce(double preco, String descricao, int compraMinima, int bonus) {
        this.preco = preco;
        this.descricao = descricao;
        this.compraMinima = compraMinima;
        this.bonus = bonus;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCompraMinima() {
        return compraMinima;
    }

    public int getBonus() {
        return bonus;
    }
    
    


}
