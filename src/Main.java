import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Daniel" + devDaniel.getConteudosInscritos());
        devDaniel.progedir();
        devDaniel.progedir();
        System.out.println("-");
        System.out.println("conteúdos inscritos Daniel" + devDaniel.getConteudosInscritos());
        System.out.println("conteúdos concluidos Daniel" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devDaniel.calcularTotalXp());

        System.out.println("--------");

        Dev devIvanlucia = new Dev();
        devIvanlucia.setNome("Ivanlucia");
        devIvanlucia.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Ivanlucia" + devIvanlucia.getConteudosInscritos());
        devIvanlucia.progedir();
        System.out.println("-");
        System.out.println("conteúdos inscritos Ivanlucia" + devIvanlucia.getConteudosInscritos());
        System.out.println("conteúdos concluidos Ivanlucia" + devIvanlucia.getConteudosConcluidos());
        System.out.println("XP:" + devIvanlucia.calcularTotalXp());

    }
}
