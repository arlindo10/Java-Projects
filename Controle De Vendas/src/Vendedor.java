public class Vendedor {
    private int codigo;
    private String nome;
    private float comissao;

    //constructor

    public Vendedor(int codigo, String nome, float comissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.comissao = comissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}
