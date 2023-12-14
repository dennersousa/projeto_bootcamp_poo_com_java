# Bootcamp Management System

Este é um sistema simples de gerenciamento de bootcamps para desenvolvedores. Ele permite que desenvolvedores se inscrevam em bootcamps, progridam em seus estudos e acumulem XP (Pontos de Experiência) ao concluir cursos e mentorias.

## Funcionalidades

### 1. Bootcamp

- **Nome e Descrição:** Cada bootcamp possui um nome descritivo e uma breve descrição do que oferece.
- **Período:** Automaticamente define um período de 45 dias a partir da data inicial.
- **Conteúdos:** Pode incluir cursos e mentorias.

### 2. Dev (Desenvolvedor)

- **Nome:** Identificação única para cada desenvolvedor.
- **Inscrição em Bootcamps:** Desenvolvedores podem se inscrever em bootcamps.
- **Progresso:** A medida que os desenvolvedores progridem, eles concluem cursos e mentorias, acumulando XP.
- **XP Total:** Soma de XP por todos os conteúdos concluídos.

### 3. Conteúdo

#### 3.1. Curso

- **Carga Horária:** Define o tempo necessário para concluir o curso.
- **XP:** Atribui XP ao desenvolvedor com base na carga horária.

#### 3.2. Mentoria

- **Data:** Define a data da mentoria.
- **XP:** Atribui uma quantidade fixa de XP.

## Como Usar

1. **Configuração Inicial:**
   - Clone o repositório.
   - Certifique-se de ter o Java instalado em sua máquina.

2. **Execução:**
   - Abra o terminal na pasta do projeto.
   - Compile os arquivos Java: `javac *.java`.
   - Execute o programa principal: `java Main`.

3. **Interagindo com o Sistema:**
   - O sistema simula a inscrição de desenvolvedores em bootcamps, progresso e cálculo de XP.
   - Confira as informações exibidas no console.

## Exemplo de Uso

```java
// Criar um bootcamp
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java/Kotlin");
bootcamp.setDescricao("Maior Bootcamp de Java/Kotlin do Brasil!");

// Adicionar cursos e mentorias ao bootcamp
bootcamp.adicionarConteudos(List.of(
        new Curso("Java", "Curso de Java", 10),
        new Mentoria("Mentoria de Java", "Como evoluir com Java"),
        new Curso("Kotlin", "Curso de Kotlin", 20),
        new Mentoria("Mentoria de Kotlin", "Como evoluir com Kotlin")
));

// Criar desenvolvedores
Dev devGato = new Dev("Gato");
Dev devPato = new Dev("Pato");

// Inscrever desenvolvedores no bootcamp
devGato.inscreverBootcamp(bootcamp);
devPato.inscreverBootcamp(bootcamp);

// Exibir informações dos desenvolvedores
exibirInformacoesDev(devGato);
exibirInformacoesDev(devPato);
```

## Melhorias Futuras

- Interface gráfica para uma melhor experiência do usuário.
- Persistência de dados para armazenar informações entre execuções.
- Adição de mais tipos de conteúdos e funcionalidades.

Sinta-se à vontade para contribuir ou fazer sugestões de melhorias!