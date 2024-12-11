package model;

public class Cliente implements Associado{
    private String nome;
    private int quantidadeDeCotas;

    public Cliente(String nome, int quantidadeDeCotas) {
        this.nome = nome;
        this.quantidadeDeCotas = quantidadeDeCotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidadeDeCotas(int quantidadeDeCotas) {
        this.quantidadeDeCotas = quantidadeDeCotas;
    }
    @Override
    public int getQuantidadeDeCotas() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", quantidadeDeCotas=" + quantidadeDeCotas +
                '}';
    }
}
