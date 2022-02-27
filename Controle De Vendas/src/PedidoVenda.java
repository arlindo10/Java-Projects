import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


public class PedidoVenda {
    private int codigo;
    private Date data;
    private ArrayList<ItemdoPedido> items = new ArrayList<>();
    private Cliente cliente;
    private Vendedor vendedor;
    private Veiculo veiculo;
    private float valorPedido;



    //#######################################################
    //------------------ constructor ------------------------
    public PedidoVenda(int codigo, Cliente cliente, Vendedor vendedor, Veiculo veiculo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.data = new Date();
    }


    //-------  método para adicionar item do pedido --------
        public void AddItemPedido(ItemdoPedido itemdoPedido){
        this.items.add(itemdoPedido);
    }


    //#######################################################
    //------------------getters and setters------------------
    //#######################################################


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<ItemdoPedido> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemdoPedido> items) {
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }





    //método calcular valor pedido
    public float calcularPedido () {
        float valorPedido=0;
        // Pecorre a lista de itens
        for (ItemdoPedido itemPedido : this.items)  { //itemPedido é variavel auxiliar pra percorrer a ArrayList
            // vai somando a variavel valordoPedido a quantidade de cada item * o valor
            // do produto associado ao item
            valorPedido += (itemPedido.getQtd() * itemPedido.getProduto().getValorProduto());
        }

        return valorPedido;

    }

    // método para imprimir pedido de venda
    public void ToString(){
        this.valorPedido = this.calcularPedido(); //valor do pedido é atualizado
        Locale ptBR = new Locale("pt", "BR"); //define o local Brasil idioma português
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy"); //objeto que manimula objeto do tipo Date para mostrá-lo
        NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(ptBR); //objeto que formata valores em float para print

        //inicio da impressão do pedido

        System.out.println("\n" + String.format("%55s", "PEDIDO DE VENDA ")); //cabeçalho
        System.out.print("\n\n");
        System.out.println("Número do Pedido: "+ String.format("%06d", this.codigo)+ //número do pedido
                String.format("%60s", "Data do Pedido: ") + String.format("%10s",ft.format(this.data))); // data do pedido
        System.out.println(String.format("%10s","Cliente: ")+this.cliente.getNome()); //nome do cliente
        System.out.println(String.format("%10s","Vendedor: "+this.vendedor.getNome())); //nome do vendedor
        System.out.println("\n"+String.format("%10s","Veículo: ")+String.format("%-20s",this.veiculo.getDescricao()) + //nome do veículo
                String.format("%45s", "Valor: ")+String.format("%19s", moedaFormat.format(this.veiculo.getValor()))); //valor do veículo
        System.out.println("\n"+String.format("%38s","").replace(" ","-")+" Itens do Pedido "+String.format("%39s","").replace(" ","-")); //quebra linha itens do pedido

        //cabeçalhos da tabela itens do pedido
        // #Item   Descrição                                         Qtd - Valor Unitário - Valor do Item
        System.out.println("\n"+String.format("%5s","#Item")+String.format("%12s","Descrição") +
                String.format("%44s","Qtd") +
                String.format("%16s"," - Valor Unitário") +
                String.format("%14s"," - Valor do Item"));

        //começa a exibir ordem item, descrição, quantidade, valor unitário e valor do Item

        //iteração para percorrer o arraylist dos itens do objeto
        for (ItemdoPedido itpd : this.items){
            System.out.println(String.format(" %04d",itpd.getSequencial()) + //imprime sequencial do item
                    " - "+ String.format("%-49s",itpd.getProduto().getDescricao()).replace(" ","-") + //imprime descrição do produto completando com "-"
                    " "+ String.format("%03d", itpd.getQtd()) + //imprime a quantidade com 3 digitos
                    " - " + String.format("%14s", moedaFormat.format(itpd.getValorItem())) + //imprime o valor unitário
                    " - " + String.format("%13s", moedaFormat.format(itpd.getValorItem()*itpd.getQtd()))); //imprime o valor total do item
        }

        System.out.println("\n"+String.format("%94s"," ").replace(" ","-")); //quebra de linha
        System.out.println("Valor do Pedido: "+String.format("%25s",moedaFormat.format(this.getValorPedido()))); //imprime valor do pedido
        System.out.println("Comissão do Vendedor: "+String.format("%20s",moedaFormat.format(this.getValorPedido() * this.getVendedor().getComissao() / 100))); //calcula e imprime a comissão do vendedor
    }//fim do método toString()
}




