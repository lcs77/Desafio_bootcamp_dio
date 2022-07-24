package br.dio.desafio.dominio;


import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria JAVA");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("++");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devlucas = new Dev();
        devlucas.setNome("Lucas");
        Dev devjamille = new Dev();
        devjamille.setNome("jamille");

        devlucas.inscreverBootcamp(bootcamp);
        devjamille.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos "+devlucas.getConteudosInscritos());
        devlucas.progredir();
        System.out.println();
        System.out.println("Conteúdos concluídos "+devlucas.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos "+devlucas.getConteudosInscritos());
        System.out.println("XP:"+devlucas.calcularTotalXp());
        System.out.println();

        System.out.println();
        System.out.println("Conteúdos inscritos "+devjamille.getConteudosInscritos());
        devlucas.progredir();
        System.out.println();
        System.out.println("Conteúdos concluídos "+devjamille.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos "+devjamille.getConteudosInscritos());






    }
}
