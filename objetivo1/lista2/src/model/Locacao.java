package model;

import java.time.LocalDateTime;

public class Locacao {
    private int id;
    private LocalDateTime dataLocacao;
    private String dataDevolucao;
    private String horaDevolucao;
    private int quilometragem;
    private Double valorCalcao;
    private Double valor_locacao;
    private Boolean devolvido;

    public Locacao() {
    }

    public Locacao(int id, LocalDateTime dataLocacao, String dataDevolucao, String horaDevolucao, int quilometragem, Double valorCalcao, Double valor_locacao, Boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public Locacao(String horaDevolucao, int quilometragem, Double valorCalcao, Double valor_locacao) {
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
    }

    public Locacao(int i, boolean b) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(String horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(Double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public Double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(Double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public Boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", dataLocacao=" + dataLocacao +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                ", horaDevolucao='" + horaDevolucao + '\'' +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
