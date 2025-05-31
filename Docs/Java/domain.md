O **domain** é o módulo responsável por definir as entidades centrais do sistema, ou seja, os objetos que representam as principais informações manipuladas pela aplicação (como usuário, transação, produto, pedido). Essas classes normalmente refletem as tabelas do banco de dados e servem como base para a lógica de negócio.

No contexto do Spring (especialmente com JPA/Hibernate), as anotações facilitam o mapeamento entre as classes Java e as tabelas do banco de dados, além de automatizar tarefas comuns. Veja um resumo das principais anotações:

- **@Entity**: Indica que a classe é uma entidade JPA e será mapeada para uma tabela no banco de dados.
- **@Table(name = "nome_tabela")**: Especifica o nome da tabela correspondente à entidade.
- **@Id**: Define o atributo como chave primária da tabela.
- **@GeneratedValue(strategy = GenerationType.IDENTITY)**: Configura a geração automática do valor da chave primária (por exemplo, auto-incremento).
- **@Column(unique = true)**: Garante que o valor do campo seja único na tabela (útil para e-mails, CPFs, etc).
- **@Enumerated(EnumType.STRING)**: Persiste enums como texto no banco, facilitando a leitura e manutenção.
- **@ManyToOne**: Define um relacionamento de muitos para um (exemplo: várias transações para um usuário).
- **@JoinColumn(name = "nome_coluna_fk")**: Especifica o nome da coluna de chave estrangeira.
- **@Getter / @Setter**: Gera automaticamente os métodos de acesso (get/set) usando Lombok.
- **@NoArgsConstructor / @AllArgsConstructor**: Cria construtores padrão e com todos os campos, também via Lombok.
- **@EqualsAndHashCode(of = "id")**: Garante que a comparação entre objetos utilize o ID, evitando problemas em coleções.
