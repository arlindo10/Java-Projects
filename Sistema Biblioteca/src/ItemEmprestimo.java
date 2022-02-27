public class ItemEmprestimo {
    private int id;
    private float valor;
    private Exemplar exp;
    private Emprestimo emp;

    public ItemEmprestimo(int id,Exemplar exp, Emprestimo emp) {
        this.id = id;
        this.exp = exp;
        this.emp = emp;
    }

    public Emprestimo getEmp() {
        return emp;
    }

    public void setEmp(Emprestimo emp) {
        this.emp = emp;
    }

    public Exemplar getExp() {
        return exp;
    }

    public void setExp(Exemplar exp) {
        this.exp = exp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float calcularValorItem(){
        this.valor = this.exp.getAcv().getValor();
        return this.valor;
    }


}
