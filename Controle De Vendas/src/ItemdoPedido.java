public class ItemdoPedido {
    private int sequencial;
    private int qtd; //quantidade
    private Produto produto;
    private float valorItem;

    //constructor

    public ItemdoPedido(int sequencial, Produto produto, int qtd) {
        this.sequencial = sequencial;
        this.qtd = qtd;
        this.produto = produto;
        this.valorItem = produto.getValorProduto()*qtd; //valor item da nota é o produto qtd x valor produto;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }


}
