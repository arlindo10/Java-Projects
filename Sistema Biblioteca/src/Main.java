public class Main {
    public static void main(String[] args) {
        java.util.Date data = new java.util.Date();
        Cliente cl1 = new Cliente(1, "001", "Cleber", "Rua A, numero 2", "" + "988819191", "Zé Walter", "60606501");
        Exemplar ex1 = new Exemplar(1,001,data,"Rambo");
        Acervo acc = new Acervo(1,"001","80s",2,TipoAcervo.FILME,TipoClassif.PRATA,TipoMedia.FITA);
        Emprestimo empp = new Emprestimo(1,"001",data,data,data,10,cl1);
        ItemEmprestimo itn = new ItemEmprestimo(1,ex1,empp);
        acc.addExemplar(ex1);
        ex1.setAcv(acc);
        empp.addItem(itn);
        empp.mostra();


    }
}