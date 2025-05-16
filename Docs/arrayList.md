## ArrayList em Java

O `ArrayList` é uma implementação da interface `List` da biblioteca Java Collections Framework. Ele permite armazenar elementos de forma dinâmica, ou seja, o tamanho da lista pode crescer ou diminuir conforme a necessidade, diferentemente de arrays tradicionais que possuem tamanho fixo.

### Características principais:

- **Dinamicidade:** Não é necessário definir o tamanho no momento da declaração.
- **Tipo Genérico:** Permite definir o tipo de elementos que serão armazenados, por exemplo, `ArrayList<String>`.
- **Métodos úteis:** Possui métodos como `.add()`, `.remove()`, `.get()`, `.set()`, `.size()`, entre outros, facilitando a manipulação dos dados.
- **Importação:** Para utilizar, é necessário importar `java.util.ArrayList`.

### Exemplo de uso:

```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();
nomes.add("Allison Boita");
nomes.add("Marcio Canela");
System.out.println(nomes); // [Allison Boita, Marcio Canela]
nomes.remove(0);
System.out.println(nomes); // [Marcio Canela]
```

### Observações:

- O `ArrayList` aceita elementos duplicados e mantém a ordem de inserção.
- Não é thread-safe, ou seja, não é seguro para uso em ambientes concorrentes sem sincronização adicional.
- O acesso aos elementos é rápido, mas inserções e remoções no meio da lista podem ser custosas em termos de desempenho.

O uso do `ArrayList` é recomendado quando precisamos de uma lista flexível e com acesso rápido aos elementos.
