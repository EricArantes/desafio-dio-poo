import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso html");
        curso2.setDescricao("descricao do curso html");
        curso2.setCargaHoraria(16);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria titulo");
        mentoria1.setDescricao("mentoria descricao");
        mentoria1.setData(LocalDate.now());

/*         System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEric = new Dev();
        devEric.setNome("eric");
        devEric.inscreverBootcamp(bootcamp);

        System.out.println("conteudos inscritos Eric: " + devEric.getConteudosInscritos());
        devEric.progredir();
        System.out.println("---");
        System.out.println("conteudos inscritos Eric: " + devEric.getConteudosInscritos());
        System.out.println("conteudos concluidos Eric: " + devEric.getConteudosConcluidos());
        System.out.println("XP " + devEric.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);


        System.out.println("--------");

        System.out.println("conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.calcularTotalXp());



    }
}
