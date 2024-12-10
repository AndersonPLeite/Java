package model;

public class Cliente  implements Investidor{
    private int id;
    private String nome;
    private String sobrenome;
    private String ticker;
    private int qtdeCotas;

    public Cliente(){
        super();
    }

    public Cliente(int id, String nome, String sobrenome, String ticker, int qtdeCotas){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ticker = ticker;
        this.qtdeCotas = qtdeCotas;
    }

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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQtdeCotas() {
        return qtdeCotas;
    }


    @Override
    public void setQtdeCotas(int qtdeCotas) {
        this.qtdeCotas = qtdeCotas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", ticker='" + ticker + '\'' +
                ", qtdeCotas=" + qtdeCotas +
                '}';
    }



}

