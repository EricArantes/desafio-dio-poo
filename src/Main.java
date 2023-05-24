import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
