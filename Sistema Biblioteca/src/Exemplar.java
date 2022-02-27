import java.util.Date;

public class Exemplar {
    private String nome;
    private int id;
    private int seq;
    private Acervo acv;
    private Date dataRegistro;

    public Exemplar(int id, int seq, Date dataRegistro,String nome) {
        this.id = id;
        this.seq = seq;
        this.dataRegistro = dataRegistro;
        this.nome = nome;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public Acervo getAcv() {
        return acv;
    }

    public void setAcv(Acervo acv) {
        this.acv = acv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
