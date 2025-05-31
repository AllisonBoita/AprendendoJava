Controllers são responsáveis por receber, processar e responder às requisições HTTP em uma aplicação. Eles funcionam como intermediários entre o cliente (frontend ou outra API) e a lógica de negócio (services), organizando o fluxo das informações.

Uma analogia comum é comparar o controller a um garçom em um restaurante: ele recebe o pedido do cliente, leva até a cozinha (service), aguarda o preparo e depois entrega a resposta ao cliente.

Principais responsabilidades dos controllers:

- Receber requisições HTTP (GET, POST, PUT, DELETE, etc.)
- Extrair dados da URL, query string ou corpo da requisição
- Chamar os serviços (services) para executar a lógica de negócio
- Retornar uma resposta adequada (geralmente em formato JSON)

Veja abaixo um exemplo prático e a explicação das principais anotações utilizadas.

Exemplo:

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public String listarUsuarios() {
        return "Listando usuários";
    }

    @PostMapping
    public String criarUsuario(@RequestBody Usuario usuario) {
        return "Usuário criado: " + usuario.getNome();
    }

}

Explicando as anotações:

| Anotação          | O que faz                                                                                                         |
| ----------------- | ----------------------------------------------------------------------------------------------------------------- |
| `@RestController` | Indica que a classe é um controller REST. Os métodos retornam dados (geralmente JSON) em vez de páginas HTML.     |
| `@RequestMapping` | Define o caminho base das URLs para os métodos do controller. Pode ser usado na classe ou em métodos individuais. |
| `@GetMapping`     | Mapeia requisições HTTP GET para um método específico. Usado para buscar dados.                                   |
| `@PostMapping`    | Mapeia requisições HTTP POST para um método. Usado para criar novos recursos.                                     |
| `@RequestBody`    | Indica que o parâmetro do método deve ser preenchido com o corpo da requisição (ex: JSON enviado pelo cliente).   |
| `@PathVariable`   | Extrai valores de variáveis presentes na URL (ex: `/usuarios/{id}` pega o valor de `id`).                         |
| `@RequestParam`   | Extrai valores de parâmetros da query string (ex: `/usuarios?nome=Joao` pega o valor de `nome`).                  |
