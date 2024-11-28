package model;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(){
        super();
    }

    public Desenvolvedor(String nome, double salario){

        this.nome = nome;
       this.salario = salario;
    }

    @Override
    public  double getBonus(){
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                '}';
    }
}
