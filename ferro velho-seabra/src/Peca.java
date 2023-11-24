import java.time.LocalDate;

//Atributos e declaração
public class Peca {
    private String nome;
    private LocalDate DataEntrada;
    private String Descricao;
    private EnumTipo tipo;
    private EnumQualidade qualidade;
    private EnumAutomovel automovel;
    private Double preco;

    //Construtor
    public Peca(String n, LocalDate data, String desc, EnumTipo tipo, EnumQualidade qualidade, EnumAutomovel automovel, Double preco){
        this.Descricao = desc;
        this.DataEntrada = data;
        this.nome = n;
        this.tipo = tipo;
        this.qualidade = qualidade;
        this.automovel = automovel;
        this.preco = preco;
    }

    //Getters e Setters
    public String getNome(){
        return this.nome;
    }
    public void setnome(String n){
        this.nome=nome;
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
    public EnumTipo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }
    public EnumQualidade getEnumQualidade() {
        return qualidade;
    }

    public void setQualidade(EnumQualidade qualidade) {
        this.qualidade = qualidade;
    }

    public EnumAutomovel getEnumAutomovel() {
        return automovel;
    }

    public void setAutomovel(EnumAutomovel automovel) {
        this.automovel = automovel;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

