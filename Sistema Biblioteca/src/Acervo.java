import java.util.ArrayList;

public class Acervo {
    private int id;
    private String codigo;
    private String title;
    private float valor;
    private TipoAcervo acv;
    private TipoClassif cls;
    private TipoMedia md;
    private ArrayList<Exemplar> exemplares = new ArrayList<>();

    public Acervo(int id, String codigo, String title, float valor, TipoAcervo acv, TipoClassif cls, TipoMedia md) {
        this.id = id;
        this.codigo = codigo;
        this.title = title;
        this.valor = valor;
        this.acv = acv;
        this.cls = cls;
        this.md = md;
    }

    public ArrayList<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(ArrayList<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }

    public TipoAcervo getAcv() {
        return acv;
    }

    public void setAcv(TipoAcervo acv) {
        this.acv = acv;
    }

    public TipoClassif getCls() {
        return cls;
    }

    public void setCls(TipoClassif cls) {
        this.cls = cls;
    }

    public TipoMedia getMd() {
        return md;
    }

    public void setMd(TipoMedia md) {
        this.md = md;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public void addExemplar(Exemplar a){
        this.exemplares.add(a);
    }
}
