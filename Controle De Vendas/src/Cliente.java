public class Cliente {
    private int codigo;
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(int codigo, String nome, TipoCliente tipoCliente) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
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

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
