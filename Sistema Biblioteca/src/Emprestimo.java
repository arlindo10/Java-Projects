import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    private int id;
    private String codigo;
    private java.util.Date dataEmprestimo;
    private java.util.Date dataEntregaPrevista;
    private java.util.Date getDataEntrega;
    private float valorEmprestimo;
    private float valorMulta;
    private float valorTotal;
    private ArrayList<ItemEmprestimo> itens = new ArrayList<>();
    private Cliente cliente;

    public Emprestimo(int id, String codigo, Date dataEmprestimo, Date dataEntregaPrevista, Date getDataEntrega, float valorMulta, Cliente cliente) {
        this.id = id;
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataEntregaPrevista = dataEntregaPrevista;
        this.getDataEntrega = getDataEntrega;
        this.valorMulta = valorMulta;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemEmprestimo> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemEmprestimo> itens) {
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(Date dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public Date getGetDataEntrega() {
        return getDataEntrega;
    }

    public void setGetDataEntrega(Date getDataEntrega) {
        this.getDataEntrega = getDataEntrega;
    }

    public float getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(float valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public float getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(float valorMulta) {
        this.valorMulta = valorMulta;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float valorEmprestimo(){
        for (ItemEmprestimo itn:itens) {
            this.valorEmprestimo += itn.calcularValorItem();
        }
    return this.valorEmprestimo;
    }

    public void addItem(ItemEmprestimo a){
        this.itens.add(a);
    }
    public void valorTotal(){
        this.valorEmprestimo();
        this.valorTotal = this.valorEmprestimo + this.valorMulta;
    }

    public void checarMulta(){
        if (this.getDataEntrega == this.dataEntregaPrevista){
            this.setValorMulta(0);
        }
    }

    public void mostra(){
        System.out.println("Emprestimo : "+this.getCodigo());
        System.out.println("Data do emprestimo: "+this.getDataEmprestimo());
        System.out.println("Data de Devolução prevista: "+this.getDataEntregaPrevista());
        System.out.println("Data de entrega : " + this.getDataEntrega);
        System.out.println("Cliente : "+this.getCliente().getNome());
        for (ItemEmprestimo a: getItens()){
            System.out.println("Exemplar : "+a.getExp().getNome());
            System.out.println("Valor : "+a.calcularValorItem());
            System.out.println("Do acervo : "+a.getExp().getAcv().getTitle());
        }
        this.checarMulta();
        this.valorTotal();

        System.out.println("Valor Multa : "+ this.getValorMulta());
        System.out.println("Valor total : "+this.getValorTotal());
    }
}
