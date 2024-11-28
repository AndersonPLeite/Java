package model;

public class Funcionario {
    private int id;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(int id, String nome) {
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

   @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", salario=" + salario + '}';
    }
}
