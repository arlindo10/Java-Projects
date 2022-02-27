public class ControleDeVendas {
    public static void main(String args[]){
        //cadastra produtos
        Produto p1 = new Produto(1, "Calota Aro 13pol", 25.00F);
        Produto p2 = new Produto(2, "Sensor Estacionamento", 1300.00F);
        Produto p3 = new Produto(3, "GPS Garmin", 1500.00F);
        //cadastra clientes
        Cliente c1 = new Cliente(1, "Egel Locadora", TipoCliente.PESSOA_JURIDICA);
        Cliente c2 = new Cliente(2, "Francisco José", TipoCliente.PESSOA_FISICA);
        //cadastro vendedor
        Vendedor vd1 =new Vendedor(1,"José Emanuel", 5.00F);
        //cadastro de veículos
        Veiculo v1 = new Veiculo(1,"Fiat Siena 2011", 32000.00F);
        Veiculo v2 = new Veiculo(2,"Volks Gol 2011", 33000.00F);
        //cria itens do pedido
        ItemdoPedido ip1 = new ItemdoPedido(1,p1,4);
        ItemdoPedido ip2 = new ItemdoPedido(2,p2,1);
        ItemdoPedido ip3 = new ItemdoPedido(3,p3,1);
        //cria pedido de venda
        PedidoVenda pv1 = new PedidoVenda(1,c1,vd1,v2);
        //adiciona itens do pedido ao pedido de venda
        pv1.AddItemPedido(ip1);
        pv1.AddItemPedido(ip2);
        pv1.AddItemPedido(ip3);
        //imprime o pedido de venda
        pv1.ToString();
    }
}
