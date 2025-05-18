## Resumo dos Tópicos

- [Repositório do Desafio PicPay](https://github.com/PicPay/picpay-desafio-backend): Projeto para praticar conceitos de backend com Spring Boot.
- **Spring Initializer**: Ferramenta para gerar projetos Spring Boot rapidamente.
  - **Maven**: Gerenciador de dependências.
  - **Spring Web**: Criação de APIs REST.
  - **JPA**: Persistência de dados com Java.
  - **Lombok**: Facilita a criação de getters, setters e construtores.
  - **Spring Dev Tools**: Ferramentas para desenvolvimento.
  - **H2 Database**: Banco de dados em memória, útil para testes unitários (os dados são apagados ao reiniciar).
- **Como usar Postgres com Spring?**
  - Veja este [vídeo tutorial](https://www.youtube.com/watch?v=LX5jaieOIAk).
- **Anotações e conceitos importantes:**
  - `Getters` e `Setters`: Métodos para acessar e modificar atributos.
  - `@AllArgsConstructor`: Gera construtor com todos os atributos.
  - `@EqualsAndHashCode`: Gera métodos de comparação.
  - `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Gera valores automáticos para IDs.
  - `enum`: Tipo especial para representar conjuntos de constantes.
- **Primeiro passo: Modelagem**

  - Criar classes para representar usuários e transações.
    - Pesquisar sobre `@ManyToOne` para relacionamentos entre entidades.
    - Configurar conexão com H2 no `application.properties`.
    - Criar classes de `Repository` para manipulação de dados (queries).

  ## O que você pode aprender com este desafio?

  - Como modelar entidades e relacionamentos em Java usando JPA.
  - Implementar APIs RESTful com Spring Boot.
  - Utilizar bancos de dados relacionais (H2 e Postgres) em projetos Java.
  - Praticar autenticação, validação de dados e tratamento de exceções.
  - Aplicar boas práticas de arquitetura e organização de código backend.

  ## Passos sugeridos para o aprendizado

  1. **Entender o desafio**: Leia o README do repositório para compreender os requisitos.
  2. **Modelar as entidades**: Crie as classes de domínio (Usuário, Transação) e defina os relacionamentos.
  3. **Configurar o banco de dados**: Ajuste o `application.properties` para usar H2 ou Postgres.
  4. **Criar repositórios e serviços**: Implemente as interfaces de acesso a dados e a lógica de negócio.
  5. **Desenvolver os endpoints REST**: Exponha as funcionalidades via controllers.
  6. **Testar e validar**: Escreva testes unitários e de integração para garantir o funcionamento.
  7. **Aprimorar**: Implemente autenticação, validação e trate possíveis exceções.

  Esses passos vão ajudar a consolidar conhecimentos essenciais para o desenvolvimento backend com Java e Spring Boot.
