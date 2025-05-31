## Resumo sobre Repositories no Spring

Um **Repository** no Spring é uma interface responsável por intermediar o acesso entre a aplicação e o banco de dados, utilizando as entidades (@Entity) definidas no projeto. Ele abstrai a complexidade das operações de persistência, permitindo realizar ações como salvar, buscar, atualizar e deletar registros sem a necessidade de escrever SQL manualmente.

### Principais características:

- Facilita a implementação do padrão **CRUD** (Create, Read, Update, Delete).
- Utiliza interfaces como `JpaRepository` ou `CrudRepository` para herdar métodos prontos.
- Permite criar consultas personalizadas por meio de métodos com nomes específicos (query methods).
- Promove a separação de responsabilidades, mantendo a lógica de acesso a dados isolada das regras de negócio.
- Suporta paginação, ordenação e filtros de forma simples.
- Integra-se facilmente com outras ferramentas do Spring, como Spring Data e Spring Boot.

### Exemplo prático

```java
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByUsername(String username);
}
```

### Benefícios do uso de Repository

- Reduz a quantidade de código repetitivo.
- Facilita a manutenção e testes da aplicação.
- Melhora a legibilidade e organização do projeto.
- Permite evoluir o acesso a dados sem impactar outras camadas.

Em resumo, o Repository é uma camada fundamental para garantir a organização, reutilização e manutenção do código em aplicações Spring.

🍽️ Analogia do Restaurante
Elemento do sistema Analogia no restaurante
UserRepository ou TransactionRepository A despensa ou câmara fria com os ingredientes
Service O cozinheiro que monta o prato
DTO O pedido anotado no papel
Entity O prato completo e montado
Repository.save() Colocar o prato pronto no armário
Repository.findById() Procurar um ingrediente na prateleira

[Cliente faz pedido (DTO)]
↓
[Controller recebe o DTO]
↓
[Service usa Repository]
↓
→ Busca os ingredientes no repositório (findById, existsByX)
→ Monta a entidade (Transaction)
→ Salva no repositório (save)

Termo Função no projeto Analogia no restaurante
UserRepository Buscar ou verificar dados de usuários Olhar se tem carne no estoque
TransactionRepository Salvar ou listar transações Guardar os pedidos entregues
save() Grava no banco Coloca o prato pronto na bandeja
findById() Busca por ID no banco Pega o ingrediente da prateleira
existsBy...() Verifica se algo já existe Vê se tem aquele item na cozinha
