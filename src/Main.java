import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp C# Developer");
        bootCamp.setDescricao("Descrição do BootCamp C#");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("William");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos do(a) "+ dev1.getNome() + ": " + dev1.getConteudoInscritos());
        System.out.println();

        dev1.progredir(); //progrediu apenas uma vez;

        System.out.println("Conteúdos Concluidos do(a) "+ dev1.getNome() + ": " + dev1.getConteudoConcluidos());
        System.out.println();
        System.out.println("Conteúdos Retantes do(a) "+ dev1.getNome() + ": "  + dev1.getConteudoInscritos());
        System.out.println("XP: " + dev1.calcularTotalXP()); //XP menor que o de Pedro;

        System.out.println("----------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Pedro");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos do(a) "+ dev2.getNome() + ": "  + dev2.getConteudoInscritos());

        dev2.progredir(); //dev três progrediu duas vezes
        dev2.progredir();
        dev2.progredir();

        System.out.println();
        System.out.println("Conteúdos Concluidos do(a) "+ dev1.getNome() + ": " + dev1.getConteudoConcluidos());
        System.out.println();
        System.out.println("Conteúdos Retantes do(a) "+ dev2.getNome() + ": "  + dev2.getConteudoInscritos()); //concluiu tudo;
        System.out.println("XP: " + dev2.calcularTotalXP()); //como ele progrediu duas vezes o XP dele é maior.


    }
}