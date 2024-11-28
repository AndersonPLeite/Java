package model;

public class Automovel {
    private Integer id;
    private String renavan;
    private String placa;
    private String cor;
    private Integer num_rodas;
    private String combustível;
    private Integer quilometragem;
    private String chassi;
    private Double valor_locacao;

    public Automovel() {
    }

    public Automovel(Integer id) {
        this.id = id;
    }

    public Automovel(Integer id, String renavan, String placa, String cor, String chassi) {
        this.id = id;
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.chassi = chassi;
    }

    public Automovel(Integer id, String renavan, String placa, String cor, Integer num_rodas, String combustível, Integer quilometragem, String chassi, Double valor_locacao) {
        this.id = id;
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.num_rodas = num_rodas;
        this.combustível = combustível;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(Integer num_rodas) {
        this.num_rodas = num_rodas;
    }

    public String getCombustível() {
        return combustível;
    }

    public void setCombustível(String combustível) {
        this.combustível = combustível;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(Double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    @Override
    public String toString() {
        return "\nAutomovel{" +
                "renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_rodas=" + num_rodas +
                ", combustível='" + combustível + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor_locacao=" + valor_locacao +
                '}';
    }
}
