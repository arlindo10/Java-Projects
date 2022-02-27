public class Produto {
    private int codigo;
    private String descricao;
    private float valorProduto;

    //constructor

    public Produto(int codigo, String descricao, float valorProduto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorProduto = valorProduto;
    }

    //getters and setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
}
