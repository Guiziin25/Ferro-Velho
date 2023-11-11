import java.time.LocalDate;

public class Peca {
    private String nome;
    private LocalDate DataEntrada;
    private String Descricao;
    private Tipo tipo;
    private Qualidade qualidade;
    private Double preco;

    public Peca(String n, LocalDate data, String desc, Tipo tipo, Qualidade qualidade, Double preco){
        this.Descricao = desc;
        this.DataEntrada = data;
        this.nome = n;
        this.tipo = tipo;
        this.qualidade = qualidade;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }
    public void setnome(String n){
        this.nome=n;
    }

    public LocalDate getDataEntrada() {
        return this.DataEntrada;
    }
    public void setDataEntrada(LocalDate data){
        this.DataEntrada=data;
    }

    public String getDescricao() {
        return this.Descricao;
    }
    public void setDescricao(String desc){
        this.Descricao=desc;
    }
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public Qualidade getQualidade() {
        return qualidade;
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

