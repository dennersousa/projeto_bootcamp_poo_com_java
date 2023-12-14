import aplicacoes.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Conteudo> conteudos = List.of(
                new Curso("Java", "Curso de Java", 10),
                new Mentoria("Mentoria de Java", "Como evoluir com Java"),
                new Curso("Kotlin", "Curso de Kotlin", 20),
                new Mentoria("Mentoria de Kotlin", "Como evoluir com Kotlin")
        );

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java/Kotlin");
        bootcamp.setDescricao("Maior Bootcamp de Java/Kotlin do Brasil!");
        bootcamp.adicionarConteudos(conteudos);

        Dev devGato = new Dev("Gato");
        devGato.inscreverBootcamp(bootcamp);
        exibirInformacoesDev(devGato);

        Dev devPato = new Dev("Pato");
        devPato.inscreverBootcamp(bootcamp);
        exibirInformacoesDev(devPato);
    }

    private static void exibirInformacoesDev(Dev dev) {
        System.out.println("### Informações do inscrito: " + dev.getNome() + " ###");
    
        int conteudosInscritos = dev.getConteudosInscritos().size();
        int conteudosConcluidos = dev.getConteudosConcluidos().size();
    
        System.out.printf("%-20s: %d%n", "Conteúdos Inscritos", conteudosInscritos);
        System.out.printf("%-20s: %d%n", "Conteúdos Concluídos", conteudosConcluidos);
    
        System.out.printf("%-20s: %.2f%n", "XP Total", dev.calcularXp());
        System.out.println();
    }
    
    
    
}
