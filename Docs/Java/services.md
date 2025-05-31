Um Service é uma classe responsável por centralizar e implementar as regras de negócio da aplicação. Ele atua como intermediário entre o Controller (que lida com as requisições externas) e o Repository (que acessa o banco de dados), orquestrando operações, validando dados e garantindo que os processos sigam as regras definidas para o domínio do sistema.

Ele não interage diretamente com o mundo externo (como o Controller), nem acessa o banco de dados diretamente (isso é responsabilidade do Repository). O Service orquestra ambos, aplicando as regras de negócio necessárias.

## 🍽️ Analogia com o Restaurante

| Componente   | O que faz na analogia      |
| ------------ | -------------------------- |
| DTO (pedido) | Pedido anotado pelo garçom |
| Controller   | O garçom                   |
| Service      | O cozinheiro chefe 🍳      |
| Repository   | O estoque/prateleira       |
| Entity       | O prato completo           |

O Service recebe o pedido do garçom (Controller) e:

- Confere o estoque (chama o Repository)
- Aplica regras (ex: "cliente não pode pedir feijoada sem saldo")
- Monta o prato (cria e preenche a entidade)
- Salva ou retorna algo

### @Service

A anotação `@Service` indica ao Spring que essa classe é um componente de serviço, ou seja, contém lógica de negócio. O Spring cria uma instância dessa classe automaticamente e permite sua injeção com `@Autowired`.

## 🧠 Exemplos de métodos em um Service

- **validateTransaction(...)**  
   Aplica regras de negócio, como garantir que o sender não seja um lojista (MERCHANT) e que tenha saldo suficiente.

- **findUserById(...)**  
   Busca usuário pelo ID usando o UserRepository. Se não encontrar, lança exceção personalizada (NotFoundUser).

- **saveUser(...)**  
   Salva o usuário no banco e imprime o documento para debug/log.

- **createUser(...)**  
   Cria um novo usuário com base no DTO, valida email/documento únicos, tipo de usuário válido, cria a entidade e salva com `saveUser(...)`.

- **getAllUsers()**  
   Lista todos os usuários do banco.

## Fluxo de uma requisição

```
[Cliente envia JSON]
                ↓
[Controller recebe DTO]
                ↓
[Service processa regras e dados]
                ↓
[Repository acessa o banco]
                ↓
[Resposta ao cliente]
```

## Resumo do papel do Service

No seu sistema, o Service:

- Garante que usuários são criados com dados válidos
- Verifica duplicidade de email/documento
- Valida tipo do usuário
- Verifica saldo antes de transações
- Orquestra chamadas para o banco de dados
