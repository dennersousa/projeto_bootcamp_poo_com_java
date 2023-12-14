# Bootcamp Management System

Este é um sistema simples de gerenciamento de bootcamps para desenvolvedores. Ele permite que desenvolvedores se inscrevam em bootcamps, progridam em seus estudos e acumulem XP (Pontos de Experiência) ao concluir cursos e mentorias.

## Estrutura do Projeto

### Pacote `aplicacoes`

#### Classe `Bootcamp`

A classe `Bootcamp` é a espinha dorsal do projeto, representando o bootcamp em si. Ela armazena informações cruciais, como nome, descrição, data de início e término, além de uma lista de desenvolvedores inscritos e os diferentes tipos de conteúdos oferecidos.

#### Classe `Dev`

A classe `Dev` modela um desenvolvedor que participa do bootcamp. Cada Dev possui um conjunto de conteúdos aos quais está inscrito e outro conjunto de conteúdos já concluídos. Os métodos nesta classe permitem que um Dev se inscreva no bootcamp, progrida em seus estudos e calcule sua experiência (XP) acumulada.

#### Classe `Conteudo`

`Conteudo` é uma classe abstrata que define a estrutura básica para cursos, mentorias e outros tipos de conteúdo. Ela contém métodos abstratos para calcular XP com base no tipo específico de conteúdo.

#### Classe `Curso`

A classe `Curso` é uma extensão de `Conteudo` que representa cursos com uma carga horária específica. O cálculo de XP é realizado com base na carga horária do curso.

#### Classe `Mentoria`

A classe `Mentoria` é outra extensão de `Conteudo` que modela mentorias com uma data específica. A XP é calculada de forma adicional para incentivar a participação em mentorias.

### Classe `Main`

A classe `Main` é a entrada principal do programa. Nela, um bootcamp é criado com uma variedade de conteúdos, e dois desenvolvedores diferentes se inscrevem no bootcamp. As informações sobre os desenvolvedores, como conteúdos inscritos, concluídos e XP total, são exibidas de maneira amigável.

## Como Executar o Projeto

1. Certifique-se de ter o JDK (Java Development Kit) instalado na sua máquina.
2. Abra um terminal na pasta do projeto.
3. Compile o código-fonte usando o comando:

```bash
javac Main.java
```

4. Execute o programa com o comando:

```bash
java Main
```

## Contribuições

Se você encontrar bugs ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma [issue](link-para-as-issues). Se desejar contribuir diretamente, faça um fork do projeto e envie um [pull request](link-para-o-pull-request). Sua contribuição é valiosa!

## Agradecimentos

Obrigado por explorar este projeto educacional! Esperamos que seja uma experiência enriquecedora para o aprendizado de Java e Kotlin.

---
