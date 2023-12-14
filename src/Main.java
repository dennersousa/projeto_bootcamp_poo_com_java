import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import aplicacoes.*;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Conteudo> conteudos = new ArrayList<>();

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(10);
        conteudos.add(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Como evoluir com Java");
        mentoria1.setData(LocalDate.now());
        conteudos.add(mentoria1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Kotlin");
        curso2.setDescricao("Curso de Kotlin");
        curso2.setCargaHoraria(20);
        conteudos.add(curso2);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Kotlin");
        mentoria2.setDescricao("Como evoluir com Kotlin");
        mentoria2.setData(LocalDate.now());
        conteudos.add(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java/Kotlin");
        bootcamp.setDescricao("Maior Bootcamp de Java/Kotlin do Brasil!");
        bootcamp.setConteudos(conteudos);

        Dev devGato = new Dev();
        devGato.setNome("Gato");
        devGato.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos para " + devGato.getNome() + ": " + devGato.getConteudosInscritos());

        Dev devPato = new Dev();
        devPato.setNome("Pato");
        devPato.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos para " + devPato.getNome() + ": " + devPato.getConteudosInscritos());
    }
}
