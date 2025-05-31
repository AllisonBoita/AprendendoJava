@RestController

Indica que a classe será um controlador REST, capaz de receber e responder requisições HTTP no formato JSON ou XML.

@RequestMapping

Define o caminho base da URL e os métodos HTTP (GET, POST, etc.) que a classe ou método irá tratar.

@Autowired

Realiza a injeção automática de dependências, permitindo que o Spring gerencie a criação e o ciclo de vida dos objetos anotados (como serviços com @Service).

@RequestBody

Indica que o corpo da requisição HTTP deve ser convertido automaticamente em um objeto Java, facilitando o recebimento de dados em métodos de controle.RestController
