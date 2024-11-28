package model;

import java.text.NumberFormat;

public class GerenteDesenvolvimento extends Gerente{
    public GerenteDesenvolvimento(){
        super();
    }

    public GerenteDesenvolvimento(String nome, double salario){

        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public  double getBonus(){
        return getSalario() * 0.20;
    }

    @Override public String toString() {
        return "Gerente de Desenvolvimento Bonus= " + NumberFormat.getCurrencyInstance().format(getBonus()) + " " +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + NumberFormat.getCurrencyInstance().format(super.getSalario()) +
                '}';
    }
}
