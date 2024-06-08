package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();
    private final Set<Dev> devs = new HashSet<>();
    private Integer cargaHorariaTotalCursos;

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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }


    public Set<Dev> getDevs() {
        return devs;
    }

    public double getCargaHorariaTotalCursos(){
        if (conteudos.size() == 0){
            return 0;
        }
        return conteudos.stream().filter(c -> c.getClass() == Curso.class).mapToInt(c -> ((Curso) c).getCargaHoraria()).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicio(), bootcamp.getDataInicio()) && Objects.equals(getDataFim(), bootcamp.getDataFim()) && Objects.equals(getConteudos(), bootcamp.getConteudos()) && Objects.equals(getDevs(), bootcamp.getDevs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicio(), getDataFim(), getConteudos(), getDevs());
    }
}
