package br.com.dio.desafio.dominio;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria  extends Conteudo{

    private LocalDate data;

    //Responsável por converter o formato da data para dd/MM/yyyy:
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public String toString() {
        return "\nMentoria: " +
                "Titulo: " + super.getTitulo() + " "+
                "Descricao: " + super.getDescricao() + " " +
                "Data:" + (data != null ? data.format(formatter) : null); //se data for diferente de nulo imprimi a data

    }

}
