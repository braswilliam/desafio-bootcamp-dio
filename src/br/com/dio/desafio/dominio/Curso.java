package br.com.dio.desafio.dominio;


public class Curso extends Conteudo{

    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return  "\nCurso: Titulo: " + super.getTitulo() + " " +
                "Descrição: " + super.getDescricao() + " " +
                "Carga Horária: " + cargaHoraria + " " +
                "XP: " + calcularXP();
    }
}

