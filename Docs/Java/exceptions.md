## 📝 Analogia do Restaurante — Tratamento de Erros

Imagine o seguinte cenário:

- O cliente faz um pedido (envia um JSON via DTO).
- O sistema tenta montar o prato (o service cria a entidade).
- Mas: o cliente pediu um prato que não existe (usuário inválido) ou não tem dinheiro suficiente (saldo insuficiente).

👉 A aplicação **não pode** retornar um erro feio com stack trace para o cliente. É preciso devolver uma mensagem de erro clara, amigável e no formato esperado pela API.

É aí que entra o `ControllerExceptionHandler` — ele funciona como o gerente educado que resolve os problemas que os garçons (controllers) não conseguiram tratar.

### 🎯 `@RestControllerAdvice` — O Gerente Central de Erros

```java
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(UserNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(InsufficientBalanceException.class)
    public ResponseEntity<String> handleInsufficientBalance(InsufficientBalanceException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
```

| Anotação                 | O que faz                                                                            |
| ------------------------ | ------------------------------------------------------------------------------------ |
| `@RestControllerAdvice`  | Indica que a classe irá interceptar exceções lançadas por qualquer `@RestController` |
| `@ExceptionHandler(...)` | Define qual tipo de exceção o método irá capturar e tratar                           |

### Exceções personalizadas

```java
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("Usuário não encontrado");
    }
}

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super("Saldo insuficiente");
    }
}
```

Essas são suas exceções personalizadas, que podem ser lançadas no Service assim:

```java
if (usuarioNaoExiste) {
    throw new UserNotFoundException();
}
if (saldoInsuficiente) {
    throw new InsufficientBalanceException();
}
```

---

### 🔁 Resumo em analogia

| Papel no restaurante | Código                                        | Função                             |
| -------------------- | --------------------------------------------- | ---------------------------------- |
| Cliente reclama      | `throw new MinhaException()`                  | Algo deu errado                    |
| Gerente responde     | `@RestControllerAdvice` + `@ExceptionHandler` | Trata o erro de forma educada      |
| Utensílio de cozinha | `@Bean RestTemplate`                          | Ferramenta reutilizável no sistema |
