import java.time.LocalDate;

public class Peca {
    private String nome;
    private LocalDate DataEntrada;
    private String Descricao;
    private Tipo;
    private Qualidade;

    public String getNome(){return this.nome}
    public void setnome(String n){this.nome=n}

    public LocalDate getDataEntrada() {return this.DataEntrada;}
    public void setDataEntrada(LocalDate data){this.DataEntrada=data}

    public String getDescricao() {return this.Descricao;}
    public void setDescricao(String desc){this.Descricao=desc}
}
public Peca(String n, LocalDate data, String desc){
    this.Descricao= desc;
    this.DataEntrada= data;
    this.nome= n;
}
