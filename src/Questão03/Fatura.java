
public class Fatura {
    private String numero;
    private String descricao;
    private int qtdCompradaDeUmItem;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int qtdCompradaDeUmItem, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdCompradaDeUmItem = qtdCompradaDeUmItem;
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura(){
        double valorFatura = qtdCompradaDeUmItem*precoPorItem;
        if(precoPorItem <0){
            precoPorItem = 0.0;
            valorFatura = qtdCompradaDeUmItem*precoPorItem;
        }else if(valorFatura <0){ // so cai neste caso quando a qtdCompradaDeUmItem for negativa
            valorFatura = 0;
        }
        return valorFatura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdCompradaDeUmItem() {
        return qtdCompradaDeUmItem;
    }

    public void setQtdCompradaDeUmItem(int qtdCompradaDeUmItem) {
        this.qtdCompradaDeUmItem = qtdCompradaDeUmItem;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
}
