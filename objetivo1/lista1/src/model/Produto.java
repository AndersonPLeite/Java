package model;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private Double valor;
    private Integer estoque;

    public Produto() {
    }

    public Produto(String nome, String descricao, Double valor, Integer estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
 //Métodos acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", estoque=" + estoque + '}';
    }
}
