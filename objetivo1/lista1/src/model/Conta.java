package model;

    public class Conta {
    private Integer id;
    private Double saldo;

    public Conta() {
    }

    public Conta(Integer id, Double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Double getSaldo() {

        return saldo;
    }

    public void deposita(Double valor){

        this.saldo = valor;
    }


    public void saca(Double valor){
        Double valorTemporario = this.saldo - valor;
        if(valorTemporario < 0 ){
            System.out.println("Saldo insuficiente. Saldo= " + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("\nSaque realizado com sucesso. Saldo atual = " + this.saldo);
    }
    public void atualizar(double taxa) {
        this.saldo += this.saldo * (taxa/100);
       // System.out.println("Saldo atualizado! Saldo atual=" + this.saldo);
    }

   @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", saldo=" + saldo + '}';
    }
}
