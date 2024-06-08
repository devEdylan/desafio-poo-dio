import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(18);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Descrição da mentoria 1");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println(bootcamp.getCargaHorariaTotalCursos());
        Dev dev1 = new Dev("Edylan");
        Dev dev2 = new Dev("Dayane");

        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos de Edylan: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Inscritos de Dayane: " + dev2.getConteudosInscritos());
        System.out.println("--------------------");
        System.out.println("Conteudos Concluidos de Edylan: " + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("Conteudos Concluidos de Edylan: " + dev1.getConteudosConcluidos());
        System.out.println(dev1.mostrarDataEstimadaTermino(bootcamp));
    }
}